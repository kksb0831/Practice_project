1주차. 자바 소스 파일(.java)을 JVM으로 실행하는 과정 이해하기.
===============================================================
학습할 것
----------
- JVM이란 무엇인가
- 컴파일 하는 방법
- 실행하는 방법
- 바이트코드란 무엇인가
- JIT 컴파일러란 무엇이며 어떻게 동작하는지
- JVM 구성 요소
- JDK와 JRE의 차이

1-1. JVM이란 무엇인가?
----------

Java Virtual Machine(JVM)이란 컴파일된 Java byte code를 각각의 OS에 맞게 해석하여 실행하는 역할을 합니다. 즉 윈도우를 사용하던 리눅스를 사용하던 어떤 운영체제를 쓰는지와 상관없이 JVM이 제대로 설치되어 있다면 코드를 OS에 맞춰 리팩토링할 필요 없이 구동할 수 있는 것을 의미합니다.

<img src="http://tcpschool.com/lectures/img_java_jvm.png" title= "출처 : http://tcpschool.com/java/java_intro_programming"></img><br>
출처 : [3) 자바 프로그래밍 - 코딩의 시작, TCP School](http://tcpschool.com/java/java_intro_programming)
<br><br><br><br>

1-2. 컴파일 하는 방법
----------
다른언어들이 코드를 해석하는 방식으로는 컴파일과 인터럽트가 있습니다. 
컴파일은 코드를 읽고  해석하여 전체 소스코드를 기계어로 바꾸어 파일로 생성하게 됩니다. 따라서 빌드과정은 오래걸리지만 실행하였을때는 기계어를 읽기만 하면되어 빠르게 실행됩니다.
인터럽트에서는 한 문장씩 읽고 바로바로 기계어로 바꾸어 실행하게 됩니다. 따라서 빌드할때 크게 하는 일은 없지만 실행속도는 느립니다.

Java에서 컴파일은 기존의 컴파일 과정과는 조금 다르게 진행됩니다. 컴파일 언어의 컴파일러들은 코드를 기계어로 변환시키는데 반해 Java의 컴파일러인 javac.exe는 JVM이 이해할 수 있게 중간 단계의 언어인 바이트 코드로 변환시켜 줘서 프로그램을 실행하게되면 JVM이 이 바이트 코드를 기계어로 변환시켜 실행하게 됩니다. 

## 실습

hello.java파일을 생성하여 안에 기본적인 코드를 입력하여 줍니다.
ex)
```
public class Hello {
    public static void main(String args[]){


        System.out.println("Hello,Java");
    }
} 
```


javac.exe를 이용해서 터미널 or IDE(이클립스, 인텔리제이)에서 컴파일 (환경변수를 설정해주었다면 그냥 
```
javac Hello.java 
```
아니라면 
```
%자바설치위치%\bin\javac Hello.java)
```


<br><br><br>



1-3. 실행하는 방법
--------------------
터미널창에서 java *.class 명령어를 사용하여 실행 or IDE에서 jdk를 등록후 실행하면 class확장자의 바이트코드를 JVM이 읽어서 실행하게 됩니다.

참고 : [점프 투 자바 01-1 안녕, 세상!](https://wikidocs.net/887)

<br><br><br>


1-4. 바이트코드란 무엇인가
----------
특정 하드웨어가 아닌 가상 컴퓨터에서 돌아가는 실행 프로그램을 위한 이진 표현법입니다. 자바 컴파일러에 의해 변환되는 코드의 명령어 크기가 1바이트라서 자바 바이트 코드라고 불리고 있으며 확장자는 .class입니다. 자바 가상 머신상에서 실행하기 위한 코드이기 때문에 운영체제에 상관없이 JVM만 설치되어 있다면 어떤 운영체제에서도 동일하게 동작합니다.

<img src="http://cfile2.uf.tistory.com/image/260F863454B5EC5E067177" title="출처 : 빌드과정에 따른 프로그래밍 언어의 분류"></img>
<br>
출처 : [빌드과정에 따른 프로그래밍 언어의 분류](http://jaynewho.com/post/14)

<br><br><br>

1-5. JIT 컴파일러란 무엇이며 어떻게 동작하는지
----------
Just-In-Time compilation(JIT)란 프로그램을 실제 실행하는 시점에 기계어로 번역하는 컴파일 기법입니다. 인터프리터 방식과 컴파일 방식을 혼합한 방식으로 볼 수 있습니다. 실행시점에 인터프리터 방식으로 기계어 코드를 생성하면서 그 코드를 캐싱하여 같은 함수가 여러 번 호출될 때 매번 생성하는 것을 방지합니다.  

일반적인 인터프리터 언어에서는 소스코드를 최적화 과정없이 번역하기 때문에 성능이 떨어지고 컴파일 언어에서는 실행전에 무조건 컴파일을 시행하여야하기 때문에 다양한 플랫폼에 맞게 컴파일을 하려면 시간이 오래걸리게 됩니다. JIT 컴파일러에서는 최적화를 미리 해줌으로써 인터프리터 언어의 단점을 보완하고 플랫폼에 맞게 수정해야하는 컴파일 언어의 단점을 가상머신을 통해 실행함으로써 보완할 수 있습니다.


<br><br>
1-6. JVM 구성 요소
----------
JVM은 크게 Class loader, Runtime Data Areas, Execution Engine으로 나누어집니다. 먼저 Class loader은 실행하는 시점에 자바로 코드를 컴파일하여 나온 .class형식의 Java byte code를 메모리에 로드하게 해줍니다.

다음으로 Runtime Data Areas는 프로그램을 수행하기 위해 OS로 부터 별도로 할당받은 메모리 공간을 의미합니다 이것은 또 크게 PC 레지스터, JVM stack, Native Method Stack, Method Area, Heap의 5가지 영역으로 나누어집니다. 각각의 요소들은 다음과 같습니다.

<img src="https://miro.medium.com/max/700/1*Zsmrw8DvVSLpRr0mvdNCuA.png" title= "출처 : https://medium.com/@lazysoul/jvm-%EC%9D%B4%EB%9E%80-c142b01571f2"></img>



마지막으로 Execution engine은 실질적으로 JVM을 실행하는 모듈입니다. Class loader로 바이트 코드를 불러와서 Runtime Data Areas에 배치하여 Execution Engine으로 실행하게 되는 것입니다. 처음에는 인터럽트 방식(코드를 한줄씩 해석하고 실행하는 방식)으로 수행하였지만 JIT 컴파일러 방식(어셈블리어와 같은 Native 코드로 변환하여 실행하는 방식)을 통해 보완하여 오래 걸리는 코드는 자동적으로 JIT 컴파일러 방식으로 변환하여 수행해서 속도를 개선하였습니다.


출처 : [JVM 이란?. # JIT | by Lazysoul | Medium](https://medium.com/@lazysoul/jvm-%EC%9D%B4%EB%9E%80-c142b01571f2)<br><br>



1-7. JDK와 JRE의 차이
----------


JRE(Java Runtime Environment)은 JVM, Java 클래스 라이브러리, java명령 및 기타 인프라를 포함하여 컴파일 된 JAVA프로그램을 실행하는데 필요한 모든 것을 포함한 패키지입니다. 
JDK(Java Developement Kit)은 자바 개발 키트로 자바의 모든 기능을 포함한 SDK입니다. 그것은 JRE뿐만 아니라 컴파일와 도구들 까지 포함되어있어 프로그램을 작성하고 컴파일 할 수 있는 도구입니다.

즉, JRE는 실행을 위한 환경을 모은 패키지이기 때문에 개발을 위한 패키지인 JDK에 포함된다고 볼 수 있습니다. 

<img src="https://i.stack.imgur.com/AaveN.png" title="JDK와 JRE의 차이점은 무엇입니까? - 일상다반사 - 티스토리"></img><br>
출처 : [JDK와 JRE의 차이점은 무엇입니까? - 일상다반사 - 티스토리](https://c10106.tistory.com/3135)




