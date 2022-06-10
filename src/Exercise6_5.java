class Exercise6_5 {
    public static void main(String args[]) {
        Student s = new Student("홍길동 ",1,1,100,60,76);
        System.out.println(s.info());
    }
}
class Student {
    String name;
    int ban;
    int no;
    int math;
    int eng;
    int kor;

    Student (String name, int ban, int no, int math, int eng, int kor) {
        this.name=name; this.ban=ban; this.no=no; this.math=math; this.eng=eng; this.kor=kor;
    }
    int getTotal(){
        return kor+eng+math;
    }
    float getAverage(){
        float avg = (float) getTotal()/3;
        return (float)(Math.round(avg*10)/10.0);
    }
    String info() { return name + "," + ban + "," + no + "," + math + "," + eng + "," + kor + "," + getTotal() + "," + getAverage(); }
}