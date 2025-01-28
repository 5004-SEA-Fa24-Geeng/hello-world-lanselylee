package student;

public class Greeting {
    private final int localityID;
    private final String localityName;
    private final String asciiGreeting;
    private final String unicodeGreeting;
    private final String formatStr;

    // Constructor for ASCII-only greeting
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello", "Hello", "%s, %s!");
    }

    // Constructor for ASCII and Unicode greeting
    public Greeting(int localityID, String localityName, String asciiGreeting) {
        this(localityID, localityName, asciiGreeting, asciiGreeting, "%s, %s!");
    }

    // Full constructor
    public Greeting(int localityID, String localityName, String asciiGreeting, String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    // Getter for localityID
    public int getLocalityID() {
        return localityID;
    }

    // Getter for localityName
    public String getLocalityName() {
        return localityName;
    }

    // Getter for asciiGreeting
    public String getAsciiGreeting() {
        return asciiGreeting;
    }

    // Getter for unicodeGreeting
    public String getUnicodeGreeting() {
        return unicodeGreeting;
    }

    // Getter for formatStr (default to Unicode greeting)
    public String getFormatStr() {
        return String.format(formatStr, unicodeGreeting, "%s");
    }

    // Getter for formatStr with option to use ASCII greeting
    public String getFormatStr(boolean useAscii) {
        String greeting = useAscii ? asciiGreeting : unicodeGreeting;
        return String.format(formatStr, greeting, "%s");
    }

    // toString method for debugging and testing
    @Override
    public String toString() {
        return String.format(
                "{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                localityID, localityName, asciiGreeting, unicodeGreeting
        );
    }
}
