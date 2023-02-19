class FindInMyStorage {
    static void main(String[] args){
        printf "Ввод товара: "
        newReader : def findItem = System.in.newReader().readLine()

        //Read file
        File file1 = new File('/Storage/storage.txt');
        def lines=file1.readLines()
        def lastline=(lines.size()-1)
        def founded = false

        for (def i=0;i<=lastline;i++)
        {
            def Item = lines.get(i)
            if (Item.equals(findItem)){
                founded = true
                break
            }
        }
        if(founded.equals(true)){
            println "Item Found " + findItem
        } else {
            println "Item not found " + findItem
        }
    }
}
