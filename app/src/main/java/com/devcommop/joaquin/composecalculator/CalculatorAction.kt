package com.devcommop.joaquin.composecalculator

// NOTES :-  We use sealed classes to send events to the ViewModel. When we need parameters we use data class and when we don't need parameters we use objects.
sealed class CalculatorAction{
    data class Number(val number: Int): CalculatorAction()
    object Clear: CalculatorAction()
    object Delete: CalculatorAction()
    object Decimal: CalculatorAction()
    object Calculate: CalculatorAction()
    data class Operation(val operation: CalculatorOperation): CalculatorAction()
}
