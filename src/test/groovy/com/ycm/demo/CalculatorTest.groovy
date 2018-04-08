package com.ycm.demo

import spock.lang.Specification

class CalculatorTest extends Specification {

    def "hello"() {
        expect:
        Calculator c = new Calculator();
        c.calculate(exp) == result

        where:
        exp     | result
        "1+2"   | 3.0
        "2+3"   | 5.0
        //"2+5"   | 7.0
    }
}