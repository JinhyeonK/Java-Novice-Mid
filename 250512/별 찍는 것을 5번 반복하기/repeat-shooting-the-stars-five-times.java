public class Main {
    
    // 10개의 '*'을 출력하는 메서드
    public static void print10Stars() {
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        System.out.println();  // 한 줄 끝난 후 줄바꿈
    }
    
    public static void main(String[] args) {
        // 5번 반복하여 print10Stars() 메서드 호출
        for (int i = 0; i < 5; i++) {
            print10Stars(); 
        }
    }
}
