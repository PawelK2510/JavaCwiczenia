class podatek{
    public static void main(String[] args){
        var dochod = prompt(parseInt());
        var podatek;
        if (dochod<= 85528){
            podatek = dochod * 0.18 - 556.02
        } else if (dochod > 85528) {
            podatek =14839.02 + dochod * 0.32
        }
    }
}