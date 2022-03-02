/*
 * © 2022 tienhuynh-tn
 * All rights reserved!
 * For more information, please contact via my email: tien.huynhlt.tn@gmail.com
 */
package com.tienhlt.mathutil.main;

import com.tienhlt.mathutil.core.MathUtil;

/**
 *
 * @author Tien Huynh - Tien Huynh TN - Huynh Le Thuy Tien
 */
public class Main {
    
    public static void main(String[] args) {
        
        //ta kiểm thử bằng cách gọi hàm, với data đưa vào, chạy, và 
        //nhìn kết quả của hàm trả về (ACTUAL) so sánh với cái ta
        //hy vọng nó sẽ trả về (EXPECTED)
        //ví dụ 5! thì ta hy vọng nhận về expected = 120
        //                  thực tế hàm getFI(5) trả về mấy actual =?
        //chạy mới biết
        //cuối cùng: so sánh EXPECTED vs. ACTUAL
        
        //để đảm bảo hàm đúng, ta phải chia cac trường hợp/nghĩ ra
        //các tình huống hàm sẽ được xài, tức là nghĩ ra các bộ data
        //đưa cho hàm, hàm chạy, output, kết luận
        //MỖI BỘ DATA ĐƯA VÀO, MỖI DATA CỤ THỂ ĐỂ TEST HÀM CHO 1 MỤC
        //ĐÍCH NÀO ĐÓ, TA GỌI LÀ TEST CASE - TÌNH HUỐNG TEST
        //n = 5, gọi hàm getF() -> test case
        //n = -5, gọi hàm getF() -> test case
        
        //Test case #1: check getF() with valid argument
        //n = 0, expected = 1; actual: đoán xem!!!
        long expected = 10; //em hi vọng
        long actual = MathUtil.getFactorial(0); //đoán xem 
        //compare 
        System.out.println("0! -> expected: " + expected
                                + "; actual: " + actual);
        
        //Test case #2: check getF() with valid argument
        //n = 6, expected = 720; actual: đoán xem!!!
        expected = 720; //em hi vọng
        actual = MathUtil.getFactorial(6); //đoán xem 
        //compare 
        System.out.println("6! -> expected: " + expected
                                + "; actual: " + actual);
        
        //Test case #3: check getF() with invalid argument
        //n = -5, expected = ??? mày phải ném ra ngoại lệ
        //thấy ngoại lệ mừng rới nước mắt
        //expected = Exeption sẽ phải xuất hiện, ko là long, thấy nó hoi
        System.out.println("Check if an exception is thrown by using invalid argument");
        MathUtil.getFactorial(-5); //đoán xem có ngoại lệ hem?
        //nhìn bằng mắt để tìm ngoại lệ xuất hiện
        
        //thiết kế -5 phải xuất hiện ngoại lệ, giờ chạy -5 có Ex xuất hiện,
        //rõ ràng app/hàm chạy đúng như thiết kế, ngoại lệ xuất hiện như
        //kì vọng, phải mừng!!!
        //5 phải 120
        //-5 phải là ngoại lệ
    }
}
