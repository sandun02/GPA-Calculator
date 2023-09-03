public class List {

        private int maxSize;
        private int position;
        //private int[] ListEntry;
        private Student[] ListEntry;
        public List(int size) {
            maxSize = size;
            ListEntry = new Student[maxSize];
            position = -1;
        }
        boolean IsListEmpty() {
            return (position == -1);
        }
        boolean IsListFull() {
            return (position == maxSize - 1);
        }
        int ListSize() {
            return (position + 1);
        }
        void InsertLast(Student x) {
            if (IsListFull()) {
                System.out.println("Attemp to insert at the end of a full list");
            } else {
                ListEntry[++position] = x;
            }
        }
        void InsertList(int p, Student element) {
            int i;
            if (IsListFull()) {
                System.out.println("Attempt to insert an setry into a full list");
            } else if (p < 0 || p > ListSize()) {
                System.out.println("Attemt to insert a position not in the list");
            } else {

                for (i = ListSize(); i > p; i--) {
                    ListEntry[i] = ListEntry[i - 1];
                    ListEntry[p] = element;
                    position++;
                }
            }
        }
    Student DeleteList(int p) {
        int i;
        Student element;
        if (IsListEmpty()) {
            System.out.println("Attempt to delete an entry from an empty list");
        } else if (p < 0 || p >= ListSize()) {
            System.out.println("Attempt to delete a possion not in thw list");
        } else {
            element = ListEntry[p];
            for (i = p; i < ListSize() - 1; i++) {
                ListEntry[i] = ListEntry[i + 1];
            }
            position--;
            return element;
        }
        return null;
    }
    Student RetrieveList(int p) {
        int i;
        Student element;
        if (IsListEmpty()) {
            System.out.println("Attempt to retrieve an entry from an empty list");
            return null;
        } else if (p < 0 || p > ListSize()) {
            System.out.println("Attempt to retrive an entry at a position not in the list");
            return null;
        } else {
            element = ListEntry[p];
            return element;
        }
    }
    void ReplaceList(int p, Student x) {
        int i;
        if (IsListEmpty()) {

            System.out.println("Attept to replace an entry of an empty list");
        } else if (p < 0 || p >= ListSize()) {
            System.out.println("Attempt to replace an entry at a position not in the list");
        } else {
            ListEntry[p] = x;
        }
    }
    void TraverselList() {
        int i;
        for (i = 0; i < position + 1; i++) {
            System.out.println(ListEntry[i]);
        }
    }
    void Insertionsort(){
        for(int i = 0; i < ListEntry.length ; i++){
            int j = i;
            while(j>0){
                if(ListEntry[j].GPA<ListEntry[j-1].GPA){
                    Student temp = ListEntry[j];
                    ListEntry[j] = ListEntry[j-1];
                    ListEntry[j-1]= temp;
                }
                j--;
            }
        }
    }
    void Insertionsort_PMAT(){
        for(int i = 0; i < ListEntry.length ; i++){
            int j = i;
            while(j>0){
                if(Q1.Subject_GPA(ListEntry[j].PMAT)<Q1.Subject_GPA(ListEntry[j-1].PMAT)){
                    Student temp = ListEntry[j];
                    ListEntry[j] = ListEntry[j-1];
                    ListEntry[j-1]= temp;
                }
                j--;
            }
        }
    }

}
