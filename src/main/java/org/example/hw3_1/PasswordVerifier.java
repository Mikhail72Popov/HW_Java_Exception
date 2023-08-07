package org.example.hw3_1;

public class PasswordVerifier {
    /**
     * Проверка длины пароля
     *
     * @param passw
     * @return
     */
    public static boolean checkLength(String passw) throws LengthDoesNotMatch {
        boolean length;
        try {
            if (passw.length() < 8) throw new LengthDoesNotMatch("Пароль слишком короткий <8");
        } catch (LengthDoesNotMatch e) {
            System.out.println("Пароль слишком короткий <8");
        } finally {
            if (passw.length() < 8) length = false;
            else length = true;
        }

        return length;
    }


    /**
     * Проверка на наличие заглавных букв и цифр
     *
     * @param passw
     */
    public static boolean check(String passw) throws LengthDoesNotMatch {
        int j = 0;
        int l = 0;
        boolean res;
        for (int i = 0; i < passw.length(); ++i) {
            if (Character.isUpperCase(passw.charAt(i))) { // Проверка на наличие заглавных букв
                ++j;
            }
            if (Character.isDigit(passw.charAt(i))) { // Проверка на наличие цифр
                ++l;
            }
        }
        try {
            if (l < 1) throw new LengthDoesNotMatch("В пароле отсутствует цифра");
        } catch (LengthDoesNotMatch e) {
            System.out.println("В пароле отсутствует цифра");
        }
        try {
            if (j < 1) throw new LengthDoesNotMatch("В пароле отсутствует заглавная буква");
        } catch (LengthDoesNotMatch q) {
                System.out.println("В пароле отсутствует заглавная буква");
        } finally {
             if (l < 1 | j < 1) res = false;
             else res = true;
        }
        return res;
    }

        /**
         * Итоговая проверка пароля
         * @param passw
         * @return
         */
        public static boolean validPassword (String passw) throws LengthDoesNotMatch {
            boolean valid;
            if (checkLength(passw) && check(passw)) {
                valid = true;
            } else {
                valid = false;
            }
            return valid;
        }
}


