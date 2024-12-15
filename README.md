# Groovy Closure Parameter Type Handling Bug

This repository demonstrates a common error when working with closures in Groovy: incorrect handling of closure parameters.  The `bug.groovy` file showcases the issue, while `bugSolution.groovy` provides the correct implementation.

**Problem:**
In Groovy, closures are flexible but require proper parameter type handling. Incorrectly defining or using parameters within a closure can result in runtime errors or unexpected behavior.

**Solution:**
Explicitly declaring the parameter type within the closure definition resolves the issue. This ensures type safety and prevents common errors associated with implicit parameter handling.
