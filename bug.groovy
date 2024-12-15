```groovy
def methodWithClosure(Closure closure) {
  println "Before closure execution"
  closure.call()
  println "After closure execution"
}

methodWithClosure { println "Inside closure" }

//Incorrect way to pass parameters to closure
methodWithClosure { param -> println "Incorrect: ${param}" } //param is not defined

//Correct way to pass parameters to closure
methodWithClosure { String param -> println "Correct: ${param}" }
```