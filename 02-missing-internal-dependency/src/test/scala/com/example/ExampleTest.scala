package com.example

import org.specs2.mutable.SpecificationWithJUnit

class ExampleTest extends SpecificationWithJUnit {

	"Example" should {
		"return 2 -> 1+1" in {
			val example = new Example()
			example.add(1,1) mustEqual 2
		}
	}
}