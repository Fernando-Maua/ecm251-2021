package kon.laiser.fernando.Models.Acoes;

import kon.laiser.fernando.Enums.HorarioSistema;

import java.util.Scanner;

public class Horario{
    HorarioSistema horario = HorarioSistema.Normal;

    //Setter
    public void setHorario(HorarioSistema horario) {
        this.horario = horario;
    }
    //Getter
    public HorarioSistema getHorario() {
        return this.horario;
    }

    //Método
    public void definirHorario(){
        Scanner input = new Scanner(System.in);
        int hora;
        System.out.println("Qual horario você deseja selecionar? (1-Normal / 2-Extra)");
        hora = input.nextInt();
        if (hora == 1){
            setHorario(HorarioSistema.Normal);
        }else if(hora == 2){
            setHorario(HorarioSistema.Extra);
        }else{
            System.out.println("Resposta não reconhecida!");
        }
    }
}
