package com.example;

object B {
	def foo = {
		C.foo
	}

	def main = foo
}