public class Q1 {
    public static void main(String[] args) {
        List l1 = new List(10);
        String[] St_ID = {"PS/2011/001", "PS/2011/002", "PS/2011/049", "PS/2011/150", "PS/2011/245", "PS/2011/352", "PS/2011/368", "PS/2011/369", "PS/2011/380", "PS/2011/450"};
        String[] PMAT = {"A","B","A-","B-","C","D","E","A+","B+","B"};
        String[] AMAT = {"B","A","A","A+","A-","A","C","A","C+","D"};
        String[] STAT = {"A","A","A","A-","A","A+","B+","A","B","A"};
        String[] COSC = {"A+","B","B-","B+","A","A+","C","B+","A","A"};
        String[] PHYS = {"C","B+","B-","A","A+","B","E","B-","B+","B"};
        for(int i = 0 ; i < St_ID.length ; i++){
            Student studentObj = new Student();
            studentObj.St_ID = St_ID[i];
            studentObj.PMAT = PMAT[i];
            studentObj.AMAT = AMAT[i];
            studentObj.STAT = STAT[i];
            studentObj.COSC = COSC[i];
            studentObj.PHYS = PHYS[i];
            studentObj.GPA = (Subject_GPA(PMAT[i]) + Subject_GPA(AMAT[i]) + Subject_GPA(STAT[i]) + Subject_GPA(COSC[i]) + Subject_GPA(PHYS[i]))/5;
            l1.InsertLast(studentObj);
        }
        //question a
        System.out.println("a).Before Sorting");
        for(int i = 0; i < l1.ListSize() ; i++){
            System.out.printf("%5s %5s %5s %5s %5s %5s %10.2f",l1.RetrieveList(i).St_ID,l1.RetrieveList(i).PMAT,l1.RetrieveList(i).AMAT,l1.RetrieveList(i).STAT,l1.RetrieveList(i).COSC,l1.RetrieveList(i).PHYS,l1.RetrieveList(i).GPA);
            System.out.println();
        }
        System.out.println();
        //question b
        l1.Insertionsort();
        System.out.println("b).After Sorting");
        for(int i = 0; i < l1.ListSize() ; i++){
            System.out.printf("%5s %5s %5s %5s %5s %5s %10.2f",l1.RetrieveList(i).St_ID,l1.RetrieveList(i).PMAT,l1.RetrieveList(i).AMAT,l1.RetrieveList(i).STAT,l1.RetrieveList(i).COSC,l1.RetrieveList(i).PHYS,l1.RetrieveList(i).GPA);
            System.out.println();
        }
        System.out.println("Highest GPA student's number is : "+l1.RetrieveList(l1.ListSize()-1).St_ID);
        System.out.println();
        //question c
        l1.Insertionsort_PMAT();
        System.out.println("c).After Sorting by Maths results");
        for(int i = 0; i < l1.ListSize() ; i++){
            System.out.printf("%5s %5s %5s %5s %5s %5s %10.2f",l1.RetrieveList(i).St_ID,l1.RetrieveList(i).PMAT,l1.RetrieveList(i).AMAT,l1.RetrieveList(i).STAT,l1.RetrieveList(i).COSC,l1.RetrieveList(i).PHYS,l1.RetrieveList(i).GPA);
            System.out.println();
        }
        System.out.println("20% means First 2 students after sorting by Maths result are repeated students");
                System.out.println("Repeat students are : "+l1.RetrieveList(0).St_ID+" , "+l1.RetrieveList(1).St_ID);
    }
    static double Subject_GPA(String s){
        if(s.equals("A+")) {
            return 4.0;
        }else if(s.equals("A")){
            return 4.0;
        }else if(s.equals("A-")){
            return 3.7;
        }else if(s.equals("B+")){
            return 3.3;
        }else if(s.equals("B")){
            return 3.0;
        }else if(s.equals("B-")){
            return 2.7;
        }else if(s.equals("C+")){
            return 2.3;
        }else if(s.equals("C")){
            return 2.0;
        }else if(s.equals("C-")){
            return 1.7;
        }else if(s.equals("D+")){
            return 1.3;
        }else if(s.equals("D")){
            return 1.0;
        }
        return 0;
    }
}


