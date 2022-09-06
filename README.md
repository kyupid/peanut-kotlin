심심해서 배워보는 심심푸리 땅콩틀린🥜

### 0. 왜 Jetbrains 은 코틀린을 만들었나?

More than 70 percent of our products were built with Java, says Hadi Hariri, Vice President of developer advocacy at JetBrains, 
and most of the rest were written in Microsoft’s C#. Although Java was very powerful 
but using java means writing a lot of boiler-plate code. Which eventually becomes hard to write, read and maintain. 
For even the simplest code needs to declare full classes and objects and all that, which becomes a big headache 
for JetBrains developers. **They just want to get rid of extra repetitive work.**   

링크: https://dev.to/jay_tillu/why-jetbrains-create-kotlin-the-inside-story-of-kotlin-creation-1135#:~:text=More%20than%2070,extra%20repetitive%20work.

#### 어떤 포인트에 집중하였나?
1. Fast (at least as fast as Java).
2. 100% Interoperability with Java. [기존에 70%이상이 자바코드로 되어있었고 이를 대체할 만한게 필요했다.](https://dev.to/jay_tillu/why-jetbrains-create-kotlin-the-inside-story-of-kotlin-creation-1135#:~:text=The%20JetBrains%20teams,a%20new%20language.)
3. Concise and expressive code.

### 1. final in JAVA VS open in Kotlin
**final method in Java**: A method that cannot be overridden.

**final class in Java**: A class that cannot be extended.

Open classes and methods in Kotlin are equivalent to the opposite of final in Java, 
an open method is overridable and an open class is extendable in Kotlin.

링크: https://stackoverflow.com/a/49076312/14058876    
요약: final 이 하는 역할의 딱 반대역할   
질문: 왜 이런 장치를 만들었을까? [답변 링크](https://blog.mindorks.com/understanding-open-keyword-in-kotlin)
