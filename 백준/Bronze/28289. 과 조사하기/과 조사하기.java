/*
문제
학교에서는 학생들을 관리하기 쉽게 1, 2반에는 소프트웨어개발과, 3반에는 임베디드소프트웨어개발과,
4반에는 인공지능소프트웨어개발과로 나누어 반 편성을 한다.

동아리 학생들의 명단이 주어지면 동아리에 소프트웨어개발과, 임베디드소프트웨어개발과,
인공지능소프트웨어개발과가 몇 명 있는지 알아보고 아무런 과에도 속할 수 없는 1학년 학생들도 몇 명이 있는지 알아보자.

입력
첫째 줄에는 동아리 학생들의 수
$P$가 주어진다.
$(1 \le P \le 100)$

둘째 줄부터
$P$개의 줄에 걸쳐 각 줄마다 학생 한 명의 학년
$G_P$, 반
$C_P$, 번호
$N_P$가 공백으로 구분되어 주어진다.
$(1 \le G_P \le 3; 1 \le C_P \le 4; 1 \le N_P \le 20)$ 학년 반 번호
$(G_P, C_P, N_P)$가 같은 학생이 두 명 이상 주어지지 않는다.
주어지는 수는 모두 정수이다.

출력
첫째 줄에 동아리에 소속된 소프트웨어개발과 학생의 수를 출력한다.
둘째 줄에 동아리에 소속된 임베디드소프트웨어개발과 학생의 수를 출력한다.
셋째 줄에 동아리에 소속된 인공지능소프트웨어개발과 학생의 수를 출력한다.
넷째 줄에 동아리에 소속된 아무런 과에도 속하지 않는 1학년 학생의 수를 출력한다.

예제 입력 1
        5
        1 3 5
        2 1 10
        2 2 12
        2 4 8
        3 3 10
예제 출력 1
        2
        1
        1
        1
소프트웨어개발과는 2학년 1반, 2학년 2반 학생 각각 1명씩 있기에 2명, 임베디드소프트웨어개발과는
3학년 3반 학생 1명, 인공지능소프트웨어개발과는 2학년 4반 학생 1명, 그리고 아무런 과에도 속하지 않는
1학년 3반 학생 1명이 있다.*/

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    int numOfCrewMembers;
    int s, e, a, n;

    CrewMember[] crewMembers;

    void setNumOfCrewMembers(){
        numOfCrewMembers = sc.nextInt();
        sc.nextLine();
    }

    void setCrewMembers(){
        crewMembers = new CrewMember[numOfCrewMembers];
        for (int i = 0; i < numOfCrewMembers; i++){
            crewMembers[i] = new CrewMember(sc.nextInt(),sc.nextInt(),sc.nextInt());
            sc.nextLine();
        }
    }

    void count(){
        for (CrewMember crewMember : crewMembers){
            if (crewMember.grade == 1){
                n++;
            }
            if (crewMember.grade >= 2 && (crewMember.classs == 1 || crewMember.classs == 2)){
                s++;
            }
            if (crewMember.grade >= 2 && crewMember.classs == 3){
                e++;
            }
            if (crewMember.grade >= 2 && crewMember.classs == 4){
                a++;
            }
        }
    }
    void setAll(){
        setNumOfCrewMembers();
        setCrewMembers();
        count();
    }
    void show(){
        System.out.println(s);
        System.out.println(e);
        System.out.println(a);
        System.out.println(n);
    }
    public static void main(String[] args){
        Main m = new Main();
        m.setAll();
        m.show();
    }
}

class CrewMember{
    int grade, classs, number;

    CrewMember(int grade, int classs, int number){
        this.grade = grade;
        this.classs = classs;
        this.number = number;
    }

}