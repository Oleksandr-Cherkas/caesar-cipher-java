class CaesarCipher {
    // Encrypt
    public static StringBuffer encrypt(String text, int count) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) + count - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) text.charAt(i) + count - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    // Decrypt
    public static StringBuffer decrypt(String cipher, int count) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < cipher.length(); i++) {
            if (Character.isUpperCase(cipher.charAt(i))) {
                char ch = (char) (((int) cipher.charAt(i) + count - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) cipher.charAt(i) + count - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String originalText = "HelloWorld";
        int shift = 7;
        System.out.println("Encryption:\nText  : " + originalText);
        System.out.println("Shift : " + shift);
        String cipher = encrypt(originalText, shift).toString();
        System.out.println("Encrypted: " + cipher);
        System.out.println("Shift : " + shift);
        String decryptedPlainText = decrypt(cipher, 26 - shift).toString();
        System.out.println("Decrypted Text: " + decryptedPlainText);
    }
}