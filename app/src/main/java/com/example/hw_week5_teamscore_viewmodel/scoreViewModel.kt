package com.example.hw_week5_teamscore_viewmodel

import androidx.lifecycle.ViewModel

class scoreViewModel : ViewModel() {

    private var _score = 0
    val score : Int
        get() = _score


     fun addOne(): Int {
        _score +=1
        return _score
    }

     fun addFour(): Int {
        _score +=4
        return _score

    }

     fun subTwo(): Int {
        _score -=2
        return _score

    }

     fun checkScoreValue() : Boolean{
        if (_score <= 2)
            _score = 2
         else if ( _score == 0)
             _score = 0
        return false
    }

    override fun onCleared() {
        _score = 0
        super.onCleared()
    }
}