package week02.collection;

import java.util.*;

public class Last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String CollectionName = sc.next();
        String title = sc.nextLine();

        switch (CollectionName) {
            case "List":
                ArrayList<String> strList = new ArrayList<>();
                while (true) {
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
                    strList.add(text);
                }

                title = "[ List로 저장된" + title + " ]";
                System.out.println(title);

                for (int i = 0; i < strList.size(); i++) {
                    int number = i + 1;
                    System.out.println(number + "." + strList.get(i));
                }
                break;

            case "Map":
                Map<Integer,String> strMap = new HashMap<>();
                int lineNumber = 1;
                while (true) {
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
                    strMap.put(lineNumber++, text);
                }

                title = "[ Map으로 저장된" + title + " ]";
                System.out.println(title);

                for (int i = 0; i < strMap.size(); i++) {
                    int number = i + 1;
                    System.out.println(number + "." + strMap.get(i+1));
                }
                break;

            case "Set":
                LinkedHashSet<String> strSet = new LinkedHashSet<>();
                while (true) {
                    String text = sc.nextLine();
                    if (Objects.equals(text, '끝')) {
                        break;
                    }
                    strSet.add(text);
                }

                title = "[ Set으로 저장된" + title + " ]";
                System.out.println(title);

                Iterator iterator = strSet.iterator();

                for (int i = 0; i < strSet.size(); i++) {
                    int number = i + 1;
                    System.out.println(number + "." + iterator.next());
                }
                break;
            default:
                System.out.println("저장할 수 없는 자료구조 입니다.");
        }
    }
}
