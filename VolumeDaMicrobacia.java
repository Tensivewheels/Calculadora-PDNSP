public class VolumeDaMicrobacia {
    public double volumeMaximoHistoricoPrecipitacao = 171.8;
    public double volumeChuvaReal;
    
    //dados "tratados"
    public double hipotenusa;
    public double areaEfetiva;
    public double precipitacaoTotal;
    
    public void calculoDoVolumeDaMicrobacia(double ladoFake, double lado2, int angulo){
        //Calculo inclinação, achar comprimento real do telhado(hipotenusa)
        double inclinacao = Math.toRadians(angulo);
        this.hipotenusa = ladoFake/Math.sin(inclinacao);
        System.out.print(hipotenusa);
        //Calculo da area do telhado com o comprimento real(hipotenusa)
        this.areaEfetiva = hipotenusa*lado2;
        System.out.print("\n"+areaEfetiva);
        //volume de chuva coletado pelo telhado segundo valor histórrico
        this.precipitacaoTotal = areaEfetiva*volumeMaximoHistoricoPrecipitacao;
        System.out.print("\n"+precipitacaoTotal);
        
        
    }
    
}