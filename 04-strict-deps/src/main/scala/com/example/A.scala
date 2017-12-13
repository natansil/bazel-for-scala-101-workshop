package com.example;

object A {
	def foo = {
		B.foo
		C.foo
	}

	def main = foo
}