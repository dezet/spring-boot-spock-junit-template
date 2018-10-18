package com.codemonkeys.template;

import spock.lang.Specification;

class TemplateSpec extends Specification {

    def "1+1=2"() {
        given:
        def a = 1
        def b = 1
        when:
        def c = a + b
        then:
        c == 2

    }

}
