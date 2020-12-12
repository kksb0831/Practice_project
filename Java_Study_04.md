3주차. 자바가 제공하는 제어문을 학습하세요.
=======================================
학습할 것
-------------
- 선택문
- 반복문
- (optional) JUnit5 학습
- (optional) Live-study 대시 보드를 만드는 코드를 작성
- (optional) LinkedList를 구현
- (optional) Stack을 구현
- (optional) 앞서 만든 ListNode를 사용해서 Stack을 구현
- (optional) Queue를 구현
<br><br>

1-1. 선택문
--------------------------------------------
자바에서 선택문은 switch case문을 사용합니다.
switch문의 형태는 다음과 같습니다.

```
        int n = 3;
        
        switch (n) {
            case 0:
                System.out.println("영");
                break;
            case 1:
                System.out.println("일");
                break;
            case 2:
                System.out.println("이");
                break;
            case 3:
                System.out.println("삼");
                break;
            case 4:
                System.out.println("사");
                break;
            case 5:
                System.out.println("오");
                break;
```
switch case문의 작동방식은 switch 옆의 변수와 case옆은 변수를 비교하여 동일한값의 case문의 아래 코드를 실행하는 방식입니다.
여기서 주의해야 할 사항은 break문의 사용인데 case문이 실행되면 그다음 코드도 계속해서 실행되게 되는 문제를 해결하기 위한 구문입니다.
위의 코드를 실행하면 
```
삼
```
이 출력되게 됩니다. 하지만 여기서 break문을 뺀 다음과 같은 코드를 실행하면

```
        int n = 3;
        
        switch (n) {
            case 0:
                System.out.println("영");
            case 1:
                System.out.println("일");
            case 2:
                System.out.println("이");
            case 3:
                System.out.println("삼");
            case 4:
                System.out.println("사");
            case 5:
                System.out.println("오");
```
이런 결과가 나오게 됩니다.
```
삼
사
오
```
따라서 선택문의 구성에 break를 주의해야합니다.

<br><br>

1-2. 반복문
--------------------------------------------
자바에서 반복문은 while문, do while문, for문이 있습니다.
먼저 While문은 While옆의 조건이 거짓이되면 종료되는 구문입니다.
while문의 구조는 다음과 같습니다.
```
        int n =0;
        while (n<=5) {
            n++;
            System.out.print("*");
        }
```
결과는 다음과 같습니다.
```
******
```
여기서 while문옆의 조건을 항상 true로 하게되면 끝없이 반복되게 됩니다.

다음은 do while문입니다. while문과 동일하지만 차이점으로는 우선 한번 실행하고 조건을 비교하다는 것에 있습니다.

```
        int n = 0;

        do {
            System.out.println("*");
        }while (n<0);
```

결과는 
```
*
```
이렇게 출력되게 됩니다. while문의 경우에는 이 조건은 항상 거짓이므로 아무것도 실행되지 않게되지만 do while문은 우선 내부를 한번 실행하고 조건을 비교하기 때문에 한번 출력이 된 후 멈추게 됩니다.

다음은 for문입니다. for문은 시작점, 종료시점, 반복시 수행할 작업을 설정해주고 거기에 맞춰 반복하게 됩니다. for문의 형식은 다음과 같습니다.
```
        for (int i = 0; i <= 5; i++) {
            System.out.print("*");
        }
```
결과는 
```
******
```

for문은 이중으로 사용하거나 다른 구문과 연합하여 사용하면서 다양하게 활용이 가능한 문법입니다.

ex) 다이아모양 별 출력
```
        int num = 5;
        for (int i = 0; i <num; i++) {
            for (int j = 0; j <num; j++) {
                if (i<=num/2) {
                    if (i+j<num/2-1) {
                        System.out.println(" ");
                    }else if (j-i>num/2+1) {
                        System.out.println(" ");
                    }else {
                        System.out.println("*");
                    }
                }else if (i>num/2){
                    if (i-j>=num/2+1)
                        System.out.print(" ");
                    else if (i+j>=num/2*3+1)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            }
            System.out.println();
        }
```







1-3. (optional) JUnit5 학습
--------------------------------------------
* 인텔리J, 이클립스, VS Code에서 JUnit 5로 테스트 코드 작성하는 방법에 익숙해 질 것.
* 이미 JUnit 알고 계신분들은 다른 것 아무거나!
* 더 자바, 테스트 강의도 있으니 참고하세요~




1-4. (optional) Live-study 대시 보드를 만드는 코드를 작성
--------------------------------------------
* 깃헙 이슈 1번부터 18번까지 댓글을 순회하며 댓글을 남긴 사용자를 체크 할 것.
* 참여율을 계산하세요. 총 18회에 중에 몇 %를 참여했는지 소숫점 두자리가지 보여줄 것.
* Github 자바 라이브러리를 사용하면 편리합니다.
* 깃헙 API를 익명으로 호출하는데 제한이 있기 때문에 본인의 깃헙 프로젝트에 이슈를 만들고 테스트를 하시면 더 자주 테스트할 수 있습니다.






1-5. (optional) LinkedList를 구현
--------------------------------------------
* LinkedList에 대해 공부하세요.
* 정수를 저장하는 ListNode 클래스를 구현하세요.
* ListNode add(ListNode head, ListNode nodeToAdd, int position)를 구현하세요.
* ListNode remove(ListNode head, int positionToRemove)를 구현하세요.
* boolean contains(ListNode head, ListNode nodeTocheck)를 구현하세요.



1-6. (optional) Stack을 구현
--------------------------------------------
* int 배열을 사용해서 정수를 저장하는 Stack을 구현하세요.
* void push(int data)를 구현하세요.
* int pop()을 구현하세요.




1-7. (optional) 앞서 만든 ListNode를 사용해서 Stack을 구현
--------------------------------------------
* ListNode head를 가지고 있는 ListNodeStack 클래스를 구현하세요.
* void push(int data)를 구현하세요.
* int pop()을 구현하세요.




1-8. (optional) Queue를 구현
--------------------------------------------
* 배열을 사용해서 한번
* ListNode를 사용해서 한번.


