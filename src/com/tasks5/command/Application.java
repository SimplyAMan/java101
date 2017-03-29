package com.tasks5.command;

public class Application {
    public static void main(String[] args){
        //YOUR CODE COMES HERE
        class Commands{
            void help(){
                System.out.println("Help executed");
            }
            void echo(String s){
                System.out.println(s);
            }
            void date(){
                System.out.println(System.currentTimeMillis());
            }
            void exit(){
                System.out.println("Goodbye!");
            }
        }
        // ConcrateCommand
        class HelpCommand implements Command{
            private Commands com;

            HelpCommand(Commands com){
                this.com = com;
            }
            @Override
            public void execute() {
                com.help();
            }
        }
        // ConcrateCommand
        class EchoCommand implements Command{
            private Commands com;
            String  s;

            EchoCommand(Commands com, String s){
                this.com = com;
                this.s = s;
            }
            @Override
            public void execute() {
                com.echo(s);
            }
        }
        // ConcrateCommand
        class DateCommand implements Command{
            private Commands com;

            DateCommand(Commands com){
                this.com = com;
            }
            @Override
            public void execute() {
                com.date();
            }
        }
        // ConcrateCommand
        class ExitCommand implements Command{
            private Commands com;

            ExitCommand(Commands com){
                this.com = com;
            }
            @Override
            public void execute() {
                com.exit();
            }
        }
        if (args != null && args.length > 0 && args.length < 3) {
            Commands commands = new Commands();
            switch (args[0]){
                case "help":
                    if (args.length == 1){
                        Command help = new HelpCommand(commands);
                        help.execute();
                    }
                    else
                        System.out.println("Error");
                    break;
                case "echo":
                    Command echo = new EchoCommand(commands,args[1]);
                    echo.execute();
                    break;
                case "date":
                    if (args[1] == "now"){
                        Command date = new DateCommand(commands);
                        date.execute();
                    }
                    else
                        System.out.println("Error");
                    break;
                case "exit":
                    if (args.length == 1) {
                        Command exit = new ExitCommand(commands);
                        exit.execute();
                    }
                    else
                        System.out.println("Error");
                    break;
                default:
                    System.out.println("Error");
            }
        }
        else {
            System.out.println("Error");
        }
    }
}
 