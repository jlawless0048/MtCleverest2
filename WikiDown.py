#josh lawless
import wikipedia
wordFile = open('wordfile.txt', 'r')
word = wordFile.read()
wiki = wikipedia.summary(word)
with open('output.txt' , "w", encoding="utf-8") as f:
        f.write(wiki)
