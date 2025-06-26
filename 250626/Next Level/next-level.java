import java.io.*;

class codetree {
    String id;
    int level;

    public codetree(String id, int level) {
        this.id = id;
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String id = br.readLine();
        if (id == null || id.isEmpty()) {
            System.out.println("ID 입력이 누락되었습니다.");
            return;
        }

        String levelInput = br.readLine();
        if (levelInput == null || levelInput.isEmpty()) {
            System.out.println("레벨 입력이 누락되었습니다.");
            return;
        }

        int level;
        try {
            level = Integer.parseInt(levelInput);
        } catch (NumberFormatException e) {
            System.out.println("레벨 입력이 숫자가 아닙니다.");
            return;
        }

        codetree ct = new codetree(id, level);
        System.out.println("user " + ct.id + " lv " + ct.level);
        System.out.println("user " + id + " lv " + level);
    }
}
