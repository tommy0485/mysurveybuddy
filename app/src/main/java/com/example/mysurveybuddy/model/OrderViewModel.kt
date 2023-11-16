package com.example.mysurveybuddy.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import com.example.mysurveybuddy.data.DataSource
import java.text.NumberFormat

class OrderViewModel : ViewModel() {

    // Map of survey items
    val surveyItems = DataSource.surveyItems

    // Default values for item scores
    private var previousRepScore = 0.0
    private var previousProductScore = 0.0
    private var previousRecommendScore = 0.0

    // rep score for the survey
    private val _rep = MutableLiveData<SurveyItem?>()
    val rep: LiveData<SurveyItem?> = _rep

    // product score for the survey
    private val _product = MutableLiveData<SurveyItem?>()
    val product: LiveData<SurveyItem?> = _product

    // recommendation score for the survey
    private val _recommend = MutableLiveData<SurveyItem?>()
    val recommend: LiveData<SurveyItem?> = _recommend

    // total score for the survey
    private val _total = MutableLiveData(0.0)
    val total: LiveData<String> = _total.map {
        NumberFormat.getNumberInstance().format(it)
    }


    /**
     * Set the set the rep value for the order.
     */
    fun setRep(rep: String) {

        if (_rep.value != null) {
            previousRepScore = _rep.value!!.score

        }
        // TODO: if _rep.value is not null, set the previous rep score to the current
        //  rep score.

        if (_total.value != null) {
            _total.value = _total.value!! - previousRepScore

        }

        // TODO: if _total.value is not null subtract the previous rep score from the current
        //  total value. This ensures that we only give a score for the currently selected rep value.

        _rep.value = surveyItems[rep]

        // TODO: set the current rep value to the survey item corresponding to the passed in string

        updateTotal(_rep.value!!.score)

        // TODO: update the total to reflect the score of the selected rep score.

    }

    /**
     * Set the product value for the survey.
     */
    fun setProduct(product: String) {
        if (_product.value != null) {
            previousProductScore = _product.value!!.score
        }
        // TODO: if _product.value is not null, set the previous product score to the current product score.

        if (_total.value != null) {
            _total.value = _total.value!! - previousProductScore

        }

        // TODO: if _total.value is not null subtract the previous product score from the current
        //  total value. This ensures that we only give a score for the currently selected product score.

        _product.value = surveyItems[product]

        // TODO: set the current product value to the survey item corresponding to the passed in string

        updateTotal(_product.value!!.score)

        // TODO: update the total to reflect the score of the selected product.
    }

    /**
     * Set the recommend value for the survey.
     */
    fun setRecommend(recommend: String) {
        if (_recommend.value != null) {
            previousRecommendScore = _recommend.value!!.score
        }

        // TODO: if recommend.value is not null, set the previous recommend score to the
        //  current recommend score.

        if (_total.value != null) {
            _total.value = _total.value!! - previousRecommendScore

        }

        // TODO: if _recommend.value is not null subtract the previous recommend score from
        //  the current total value. This ensures that we only give a score for the currently selected
        //  recommend score.

        _recommend.value = surveyItems[recommend]

        // TODO: set the current recommend value to the survey item corresponding to the passed in
        //  string

        updateTotal(_recommend.value!!.score)
        // TODO: update the total to reflect the score of the selected recommend score.
    }

    /**
     * Update total value.
     */
    private fun updateTotal(itemPrice: Double) {

        if(_total.value != null) {
            _total.value = _total.value!! + itemPrice
        }
        else{
            _total.value = itemPrice
        }
        // TODO: if _total.value is not null, update it to reflect the score of the recently
        //  added survey item.
        //  Otherwise, set _total.value to equal the score of the survey item.

    }


    /**
     * Reset all values pertaining to the survey.
     */
    fun resetSurvey() {
        previousRepScore = 0.0
        previousProductScore = 0.0
        previousRecommendScore = 0.0
        _rep.value = null
        _product.value = null
        _recommend.value = null
        _total.value = 0.0

        // TODO: Reset all values associated with a survey
    }
}