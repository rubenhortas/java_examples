| Element       | Notation                     | Example                    | 
|---------------|------------------------------|----------------------------|
| Annotation    | PascalCase (UpperCamelCase)  | MyAnnotation               |
| Constant      | SCREAMING_SNAKE_CASE         | MY_CONSTANT                |
| Class         | PascalCase (UpperCamelCase)  | MyClass                    |
| Enums         | PascalCase (UpperCamelCase)  | MyEnum                     |
| Interface     | PascalCase (UpperCamelCase)  | MyInterface                |
| Method        | camelCase (lowerCamelCase)   | myMethod                   |
| Package       | lower.dot.case               | my.package.com             |
| Property file | lower.dot.case               | my.application.properties  |
| Record        | PascalCase (UpperCamelCase)  | MyRecord                   |
| Variable      | camelCase (lowerCamelCase)   | myVariable                 |

# Comments

  * ## Single line comment  
    Used to comment only one line of the code

    ```java
    // comment
    ```

  * ## Multi line comment  
    Used to comment multiple lines of code.  
    Used when it's difficult to use single line comment.

    ```java
    /* A multi line
    comment */
    ```

  * ## Java Documentation comment
    Used to create documentation API.  
    To create documentation API the javadoc tool is needed.

    ```java
    /**
    * This is an explanation
    * for the documentation API
    */
    ```