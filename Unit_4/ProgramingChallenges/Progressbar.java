/*
Aidan
 */
import java.util.Scanner;

public class Progressbar {
    public static void main(String[] args) {

        double input;
        double percent;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value from 0 to 20: ");
        input = in.nextInt();

        percent = input / 20;

        if (percent == 1) {
            System.out.printf("Progress: [####################] 100%%");
        } else if (percent == 0.9) {
            System.out.printf("Progress: [##################--]  90%%");
        } else if (percent == 0.8) {
            System.out.printf("Progress: [################----]  80%%");
        } else if (percent == 0.7) {
            System.out.printf("Progress: [##############------]  70%%");
        } else if (percent == 0.6) {
            System.out.printf("Progress: [############--------]  60%%");
        } else if (percent == 0.5) {
            System.out.printf("Progress: [##########----------]  50%%");
        } else if (percent == 0.4) {
            System.out.printf("Progress: [########------------]  40%%");
        } else if (percent == 0.3) {
            System.out.printf("Progress: [######--------------]  30%%");
        } else if (percent == 0.2) {
            System.out.printf("Progress: [####----------------]  20%%");
        } else if (percent == 0.1) {
            System.out.printf("Progress: [##------------------]  10%%");
        } else if (percent == 0) {
            System.out.printf("Progress: [--------------------]   0%%");
        } else if (percent == 0.05) {
            System.out.printf("Progress: [#-------------------]   5%%");
        } else if (percent == 0.15) {
            System.out.printf("Progress: [###-----------------]   15%%");
        } else if (percent == 0.25) {
            System.out.printf("Progress: [#####---------------]   25%%");
        } else if (percent == 0.35) {
            System.out.printf("Progress: [#######-------------]   35%%");
        } else if (percent == 0.45) {
            System.out.printf("Progress: [#########-----------]   45%%");
        } else if (percent == 0.55) {
            System.out.printf("Progress: [###########---------]   55%%");
        } else if (percent == 0.65) {
            System.out.printf("Progress: [#############-------]   65%%");
        } else if (percent == 0.75) {
            System.out.printf("Progress: [###############-----]   75%%");
        } else if (percent == 0.85) {
            System.out.printf("Progress: [#################---]   85%%");
        } else if (percent == 0.95) {
            System.out.printf("Progress: [###################-]   95%%");
        } 
        in.close();
    }
}
