import java.util.*;
import java.util.regex.*;

public class DomainExtracter {
    public static void main(String[] args) {
        // Test cases
        List<String> sentences = Arrays.asList(
            "contact at hr@morphle.in for more details on job requirements. We are here to help.",
            "for best response time sales inquiries contact:sales@morphle.in.We have an active sales team.",
            "Why bother waiting response from contact@ai.morphle.com, when you call do a Skype call to contact@morphle.in.",
            "Is morphle@googlegroups.combest way to communicate within morphle.in community?"
        );

        for (String sentence : sentences) {
            Set<String> domains = extractDomains(sentence);
            System.out.println(String.join(", ", domains));
        }
    }

    public static Set<String> extractDomains(String text) {
        Set<String> domainSet = new LinkedHashSet<>();
        String regex = "\\b[A-Za-z0-9.-]+(?:\\.[A-Za-z0-9-]+)*\\.(?:com|in)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            domainSet.add(matcher.group()); // Add domain to set (avoid duplicates)
        }

        return domainSet;
    }
}
