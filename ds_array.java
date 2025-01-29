public class ds_array {

    public static void update(int marks[]){
       for(int i=1;i<marks.length;i++){
        marks[i]= marks[i]+1;
       }

    }
    public static void main(String[] args) {
        int marks[]={7,2,4};
        update(marks);

        for(int i=1;i<marks.length;i++){
            System.out.println(marks[i]+"");
        }
        System.out.println();
        
    }
    
}
