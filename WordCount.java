package ss11.BT.WordCount;

import java.util.Map;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        String input = "Đây là một chuỗi mẫu. Chuỗi này được sử dụng để đếm từ.";

        // Tạo một TreeMap để lưu trữ từ và số lần xuất hiện
        TreeMap<String, Integer> wordCountMap = new TreeMap<>();

        // Tách chuỗi thành các từ và đếm số lần xuất hiện của từng từ
        String[] words = input.split(" ");
        for (String word : words) {
            // Chuyển đổi từ thành chữ hoa hoặc chữ thường để tránh trùng lặp
            String normalizedWord = word.toLowerCase();

            // Nếu từ đã tồn tại trong TreeMap, tăng số lần xuất hiện lên 1
            if (wordCountMap.containsKey(normalizedWord)) {
                int count = wordCountMap.get(normalizedWord);
                wordCountMap.put(normalizedWord, count + 1);
            }
            // Nếu từ chưa tồn tại, thêm từ vào TreeMap với giá trị mặc định là 1
            else {
                wordCountMap.put(normalizedWord, 1);
            }
        }

        // Hiển thị từng từ và số lần xuất hiện của chúng
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
