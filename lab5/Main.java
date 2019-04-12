package hwKPI.lab5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Text text = new Text("Some text is written over there. There is a next sentence. I wrote this for some reason I don't even know! Hello.");
        System.out.println(text);
        char leftLimit = 't';
        char rightLimit = 'n';
        int startIdx = -1;
        int endIdx = -1;
        ArrayList<GetAble> letterList = text.getTextBySymbols();
        for (int i = 0; i < letterList.size(); i++) {
            if (letterList.get(i).getSymbol() == leftLimit){
                startIdx = i;
                break;
            }
        }
        for (int i = letterList.size() - 1; i > 0; i--) {
            if (letterList.get(i).getSymbol() == rightLimit){
                endIdx = i;
                break;
            }
        }
        Text resultText = new Text("");
        if (startIdx != -1 || endIdx != -1){
            letterList.subList(startIdx, endIdx + 1).clear();
            for (int i = 0; i < letterList.size(); i++) {
                resultText.setText(resultText.getText() + letterList.get(i).getSymbol());
            }
            System.out.println(resultText);
        }
        else{
            System.out.println("Substring wasn't found.");
        }
    }
}
