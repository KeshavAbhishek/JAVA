document.querySelectorAll("pre")[0].innerHTML=`public class printFloatNumbers {
    public static void main(String[] args){
        float a = 10.5f;
        float b = 10.1f;

        System.out.println("Floating numbers are " + a + " & " + b);
    }
}` + `<div class="copied">Copied</div>`;

document.querySelectorAll("pre")[1].innerHTML=`import java.util.*;

public class operation {

    public static void main(String[] args) {
        System.out.print("Operation\n\n1. Addition\n2. Substraction\n3. Multiplication\n4. Division\n5. Modulus\n\nEnter choice : ");

        try (Scanner sc = new Scanner(System.in)) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Addition : " + (sc.nextInt() + sc.nextInt()));
                    break;

                case 2:
                    System.out.println("Substraction : " + (sc.nextInt() - sc.nextInt()));
                    break;

                case 3:
                    System.out.println("Multiplication : " + (sc.nextInt() * sc.nextInt()));
                    break;

                case 4:
                    System.out.println("Multiplication : " + (sc.nextInt() / sc.nextInt()));
                    break;

                case 5:
                    System.out.println("Modulus : " + (sc.nextInt() % sc.nextInt()));
                    break;
                default:
                    break;
            }
        }

    }
}` + `<div class="copied">Copied</div>`;

var clipboard = document.querySelectorAll(".fa-clipboard");

var code = document.querySelectorAll("pre");

var copied = document.querySelectorAll(".copied");

for (let i = 0; i < clipboard.length; i++) {
    const element = clipboard[i];
    element.addEventListener("click",(e)=>{
        copied[i].style.transform="rotateX(0deg)";
        navigator.clipboard.writeText(code[i].innerHTML.split("<")[0]);
        setTimeout(() => {
            copied[i].style.transform="rotateX(90deg)";
        }, 1000);
    })
}