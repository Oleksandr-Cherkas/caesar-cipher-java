class CaesarCipher {
    public static StringBuffer crypt(String text, int count) {
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

    public static void main(String[] args) {
        String originalText = "Hello World";
        int key = 5;
        System.out.println("Encryption:\nText  : " + originalText);
        System.out.println("Key: " + key);
        String cipher = crypt(originalText, key).toString();
        System.out.println("Encrypted: " + cipher);
        String decryptedPlainText = crypt(cipher, 26 - key).toString();
        System.out.println("Decrypted Text: " + decryptedPlainText);
    }
}