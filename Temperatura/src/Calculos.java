public class Calculos {
    private double temperatura_Celsius;
    private double temperatura_Kelvin;
    private double temperatura_Reaumur;
    private double temperatura_Rankine;
    private double temperatura_Fahrenheit;

    public Calculos() {
    }

    public double getTemperatura_Celsius() {
        return this.temperatura_Celsius;
    }

    public double getTemperatura_Kelvin() {
        return this.temperatura_Kelvin;
    }

    public double getTemperatura_Reaumur() {
        return this.temperatura_Reaumur;
    }

    public double getTemperatura_Rankine() {
        return this.temperatura_Rankine;
    }

    public double getTemperatura_Fahrenheit() {
        return this.temperatura_Fahrenheit;
    }

    public void setTemperatura_Celsius(double temperatura, String tipo_de_temperatura) {
        switch (tipo_de_temperatura) {
            case "Celsius" -> this.temperatura_Celsius = temperatura;
            case "Kelvin" -> this.temperatura_Celsius = temperatura + 273.15;
            case "Reaumur" -> this.temperatura_Celsius = temperatura * 0.8;
            case "Rankine" -> this.temperatura_Celsius = temperatura * 1.8 + 32.0 + 459.67;
            case "Fahrenheit" -> this.temperatura_Celsius = temperatura * 1.8 + 32.0;
        }

    }

    public void setTemperatura_Kelvin(double temperatura, String tipo_de_temperatura) {
        switch (tipo_de_temperatura) {
            case "Celsius" -> this.temperatura_Kelvin = temperatura + 273.15;
            case "Kelvin" -> this.temperatura_Kelvin = temperatura;
            case "Reaumur" -> this.temperatura_Kelvin = temperatura * 5.0 / 4.0 + 273.15;
            case "Rankine" -> this.temperatura_Kelvin = temperatura * 5.0 / 9.0;
            case "Fahrenheit" -> this.temperatura_Kelvin = (temperatura - 32.0) * 5.0 / 9.0 + 273.15;
        }

    }

    public void setTemperatura_Reaumur(double temperatura, String tipo_de_temperatura) {
        switch (tipo_de_temperatura) {
            case "Celsius" -> this.temperatura_Reaumur = temperatura / 1.25;
            case "Kelvin" -> this.temperatura_Reaumur = (temperatura - 273.15) / 1.25;
            case "Reaumur" -> this.temperatura_Reaumur = temperatura;
            case "Rankine" -> this.temperatura_Reaumur = (temperatura - 491.67) / 2.25000002;
            case "Fahrenheit" -> this.temperatura_Reaumur = (temperatura - 32.0) / 2.25000002;
        }

    }

    public void setTemperatura_Rankine(double temperatura, String tipo_de_temperatura) {
        switch (tipo_de_temperatura) {
            case "Celsius" -> this.temperatura_Rankine = temperatura * 1.8 + 491.67;
            case "Kelvin" -> this.temperatura_Rankine = (temperatura - 273.15) * 1.8 + 491.67;
            case "Reaumur" -> this.temperatura_Rankine = temperatura * 2.25 + 491.67;
            case "Rankine" -> this.temperatura_Rankine = temperatura;
            case "Fahrenheit" -> this.temperatura_Rankine = temperatura + 459.67;
        }

    }

    public void setTemperatura_Fahrenheit(double temperatura, String tipo_de_temperatura) {
        switch (tipo_de_temperatura) {
            case "Celsius" -> this.temperatura_Fahrenheit = temperatura * 1.8 + 32.0;
            case "Kelvin" -> this.temperatura_Fahrenheit = 1.8 * (temperatura - 273.0) + 32.0;
            case "Reaumur" -> this.temperatura_Fahrenheit = temperatura * 9.0 / 4.0 + 32.0;
            case "Rankine" -> this.temperatura_Fahrenheit = temperatura - 491.67 + 32.0;
            case "Fahrenheit" -> this.temperatura_Fahrenheit = temperatura;
        }

    }

    public void mostrar_temperaturas() {
        System.out.println("Temperatura em Celsius: " + this.getTemperatura_Celsius());
        System.out.println("Temperatura em Kelvin: " + this.getTemperatura_Kelvin());
        System.out.println("Temperatura em Réaumur: " + this.getTemperatura_Reaumur());
        System.out.println("Temperatura em Rankine: " + this.getTemperatura_Rankine());
        System.out.println("Temperatura em Fahrenheit: " + this.getTemperatura_Fahrenheit());
        System.out.println("===================================================");
    }

    public void calcular_temperaturas(double temperatura, String tipo_de_temperatura) {
        this.setTemperatura_Celsius(temperatura, tipo_de_temperatura);
        this.setTemperatura_Kelvin(temperatura, tipo_de_temperatura);
        this.setTemperatura_Reaumur(temperatura, tipo_de_temperatura);
        this.setTemperatura_Rankine(temperatura, tipo_de_temperatura);
        this.setTemperatura_Fahrenheit(temperatura, tipo_de_temperatura);
    }
}
