```groovy
def methodWithClosure(Closure closure) {
  println "Before closure execution"
  closure.call()
  println "After closure execution"
}

methodWithClosure { println "Inside closure" }

//Correct way to pass parameters to closure
methodWithClosure { String param -> println "Correct: ${param}" }

//Passing parameters to the closure
methodWithClosure { String param -> println "Parameter passed: ${param}" }("Hello World")

//Another correct example with multiple parameters
methodWithClosure { String name, Integer age -> println "Name: ${name}, Age: ${age}" }("John Doe", 30)
```