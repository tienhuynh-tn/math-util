/*
 * © 2022 tienhuynh-tn
 * All rights reserved!
 * For more information, please contact via my email: tien.huynhlt.tn@gmail.com
 */
package com.tienhlt.mathutil.core;

/**
 *
 * @author Tien Huynh - Tien Huynh TN - Huynh Le Thuy Tien
 */

//Class này cung cấp các tiện ích/đồ chơi/1 loạt các hàm toán học
//giúp cho các class khác sử dụng..., ví dụ app Calculator cần
//rất nhiều hàm toán học
//Cái gì mà là tiện ích dùng chung, sure nó nên đc design là STATIC
public class MathUtil {
    
    //hàm tính n giai thừa n! = 1.2.3.4...n
    //không có giai thừa số âm
    //0! = 1! = 1 quy ước
    //giai thừa tăng rất nhanh, 20! vừa đủ cho long, 18 con số 0
    //21 vượt long vượt 18 số 0, tràn
    //chặn việc n < 0 và/hoặc n > 21
    public static long getFactorial(int n) {
        
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid argument."
                    + " n must be between 0..20");
        
        if (n == 0 || n == 1) 
            return 1;
        
        //sống sót đến đây, sure n = 2..20
        long product = 1; //kết quả trung gian
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;
    }
}
