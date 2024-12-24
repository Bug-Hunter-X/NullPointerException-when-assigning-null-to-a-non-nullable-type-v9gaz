# Scala NullPointerException with Non-nullable Types
This example demonstrates a common error in Scala: attempting to assign `null` to a variable with a non-nullable type.  This results in a `NullPointerException` at runtime.

The `bug.scala` file contains the erroneous code. The `bugSolution.scala` file provides a corrected version, showcasing best practices for handling potentially null values.  The key is to use `Option` to represent values that might be absent.