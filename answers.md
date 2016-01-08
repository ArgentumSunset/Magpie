# Start Questions

1. It responds with "Tell me more about your family."

2. It says "Why so negative?"

3. It responds by saying "Interesting. Tell me more."

4. It says "Tell me more about your family."

# Exercises


## Table

### Keyword --> Response
idiot, moron, simpleton --> Well. I guess we know how you feel about me then.
Hail Satan --> FOR HE IS THE DELIVERER OF SOULS.
Her Majesty --> Hail Britannia!

The chatbot simply responds with the response that is higher in the logic of Magpie2.java. To prioritize responses, you would need to place whichever response you would like prioritized nearer the top of the if/if-else block that contains your responses. So, if you wanted to place, say, 'he sounds like a good teacher' ahead of 'tell me more about your pets', simply place its logic above that of the pets logic.

Question 1: When a keyword is included in another word, it is recognized as the same keyword by the Magpie chatbot. In the phrase "I know all the state capitals" for example, the letters 'no' appears in 'know', causing Magpie to interpret it as the word 'no' and reply accordingly. Similarly, the phrase "I like vegetables smothered in cheese" contains the keyword 'mother', and it will be interpreted as a parental query, simply because Magpie evaluates the string without regard to words. If 'mother' appears anywhere, Magpie evaluates it to be the word 'mother'.