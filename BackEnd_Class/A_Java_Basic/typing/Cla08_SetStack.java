package BackEnd_Class.A_Java_Basic.typing;


public class Cla08_SetStack {

    public static void main(String[] args) {

//        java, 알고리즘, spring(security, jpa, thymeleaf/jsp, restrAPI-프론트연결)
//        dbms(★ mysql, oracle, redis), 네트워크(http, https, IP/PORT), 운영체제(LINUX), AWS
//        docker github

/*

        String[] participant = {"leo", "kiki", "eden", "aaaa"};
        String[] completion = {"eden", "kiki", "aaaa"};
        String answer = "";
        Map<String, Integer> mp = new HashMap<>();
        for (String a : participant) {
            if (mp.containsKey(a)) {
                mp.put(a, mp.get(a) + 1);
            } else {
                mp.put(a, 1);
            }

            // mp.put(a,mp.getOrDefault(a,0)+1);  0이 Default값
            // getOrDefault : key를 통해 값을 꺼내오되, 값이 있으면 해당값, 값이 없으면 Default로 설정한 값

        }

        for (String a : completion) {

            //if(!mp.containsKey(a)){
            //      break; }

            if (mp.get(a) > 1) {
                mp.put(a, mp.get(a) - 1);
            } else {
                mp.remove(a);
            }
        }

        for(String a : mp.keySet()){
            answer = a;
        }


//        map의 요소 출력방법1 : enhanced for문
//                  출력방법2 : iterator() 메소드를 이용한 요소의 출력
//                            iterator는 요소를 꺼낼때 소모가 된다.
        Iterator<String> iter = mp.keySet().iterator();  //iterator 형으로 변환하여 iterator자료로 받는다 → 스프링에서 많이 사용
        while(iter.hasNext()){  // hasNext요소가 있는지 없는지를 boolean 형태로 출력
            System.out.println(iter.next());  //Next는 요소를 꺼내는 메소드
        }



//        map : Hashmap 순서없음, TreeMap<>()으로 해야 함

//        자료형 - set(집합) : 중복이 없다. 순서가 없다.

        String[] class1 = {"kim", "lee","lee","kim","choi"}; //m개
//                case1) class1에 어떤 성이 있는가? 중복제거
        //map으로 구현
        Map<String, Integer> map1 = new HashMap<>();
        for(String a : class1){
            map1.put(a,map1.getOrDefault(a,0)+1);
        }
        
        Set<String> set1 = new HashSet<>();
        for(String a : class1){    // 정렬필요시 Treeset
            set1.add(a);
        }
        System.out.println(set1);


        // 교집합, 합집합, 차집합

        Set<Integer> st1 = new HashSet<>();
//        st1 : {1,2,3}, st2 : {2,3,4} => 합집합 : 1,2,3,4 교집합, 2,3 차집합 st1-st2 : 1
        st1.add(1);
        st1.add(2);
        st1.add(3);
        Set<Integer> st2 = new HashSet<>(Arrays.asList(2,3,4));  // list를 바로 입력하여 선언
        System.out.println(st1);
        System.out.println(st2);

//        합집합 : addAll
//        교집합 : retainAll
//        차집합 : removeAll
        st1.removeAll(st2);
        System.out.println(st1);

//        값을 더하는 것 : add
//        여러값을 한꺼번에 더할때 : addAll
//        제거하는 것 : remove

        Set<Integer> st3 = new HashSet<>();
        st3.add(10);
        st3.addAll(Arrays.asList(20,30,40));
        System.out.println(st3);




//        자료형 - Stack (후입선출) -> Stack메모리 구성
        Stack<String> st = new Stack<>();
//        자료를 더하는 것은 push (like add)
//        자료를 꺼내는 것은 pop, 그런데 pop은 실제로 자료를 꺼내버리기 때문에,
//        peek을 사용해서 마지막자료가 무엇인지만 확인을 할 수도 있다.

        st.push("a1");
        st.push("a2");
        st.push("a3");
        st.isEmpty();


//        << 같은 숫자는 싫어 >>
//        배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
//
//arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
//arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
//배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        Stack<Integer> st = new Stack<>();
        for(int a : arr){
            if(st.isEmpty()){   //값없는 데이터 peek 에러
                st.push(a);
            }else if(st.peek()==a){

            }else{
                st.push(a);
            }
        }

        System.out.println(st);


        int[] answer = new int[st.size()];
        int i = 0;
        for(int a : st){
            answer[i]=a;
            i++;
        }
        System.out.println(Arrays.toString(answer));




//       Queue
//        1) 선언
        Queue<Integer> q1 = new LinkedList<>();  // 일반적인 선언 방식
        //        Queue를 선언할 때 LikedList를 선언하여 Queue로 받아주는 방식이 일반적인 방식이다.
//        <업캐스팅의 이유>
//        1. 추후 변경사항이 생겼을때, 유연하게 likendlist부분만 바꿔주면 되는 유연함이 있다.
//        2. Linkedlist가 queue 상속(또는 구현) 하고 있기 때문에, LinkedList에는 없는 기능을 쓸수가 있다.
//        2) list와 유사하나 뒷자리 주소를 가지고 있음.

        q1.add(10);
        q1.add(20);
        System.out.println(q1);
        System.out.println(q1.peek());
        System.out.println(q1);
        System.out.println(q1.poll());
        System.out.println(q1);

        Deque<Integer> dq = new ArrayDeque<>();
        //addFrist도 있고, addLast도 있다.
        dq.addLast(10);
        dq.addLast(20);
        dq.addLast(30);
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        System.out.println(dq);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println(dq);




//        다차원배열

        int[][] arr = {{2,2},{3,3},{4,4}}; // 2차원 표현
        // 1차원 배열
        String[] person1 = {"kim","19","male"};
        String[] person2 = {"lee","20","female"};
        String[] person3 = {"lee","21","male"};

        // 2차원 배열
        String[][] class1 = {{"kim","19"},{"lee","20","male"},{"lee","21"}};
        System.out.println(class1[1][0]);

        String[][] class2 = new String[3][];  // 길이를 가변적으로 선언할 수는 있으나, 자료 입력시에는 길이를 선언하고 입력해야함
        class2[0][0] = "kim";
        class2[0][1] = "19";
        class2[1][0] = "lee";
        class2[1][1] = "20";
        class2[2][0] = "choi";
        class2[2][1] = "20";

        for(String[] a : class2 ){
            for(String b : a){
                System.out.println(b+" ");
            }
            System.out.println();

        }



        int[][] s1 = {{60, 40, 70, 70}, {40, 80, 100, 100}, {80, 100, 50, 50, 100}};
//        for문을 통해 각반의 수학점수의 평균을 구하시오.
//        평균을 담은 1차원 배열을 만들어서 출력해주세요.

        int[] answer = new int[s1.length];

        int i = 0;

        for (int[] a : s1) {   // for(int i ~ answer 와 index공유)
            for (int b : a) {
                answer[i] += b;
            }
            answer[i] = answer[i] / a.length;
            i++;
        }

        System.out.println(Arrays.toString(answer));

*/


















    }
}
