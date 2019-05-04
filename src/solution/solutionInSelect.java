package solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solutionInSelect {

    public static void main(String[] args)
    {       String condition1 = "remove candle";
        String condition2 = "close door";
        String condition3 = "candle in";
        String condition4="key turned";
        int pos=0;
        List<String> operation = new ArrayList<>();
        System.out.println("If you want to find the treasure please enter the correct steps or you will die!");
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine())
        {
            operation.add(input.nextLine());
            pos++;
            if(pos==5)
            {
                break;
            }
        }
        // remove -> close -> key -> die||safe
      for(int i=0;i<operation.size();i++)
      {
          if(operation.get(i).equals(condition1))  //romve先
          {
              for(int j=i+1;j<operation.size();j++)
              {
                  if(operation.get(j).equals(condition2))
                  {
                      for(int k=j+1;k<operation.size();k++)
                      {  //从wait进入到Lock状态 开始判断蜡烛的对错
                          if(operation.get(k).equals(condition3))
                          {
                              for(int z=k+1;z<operation.size();z++)
                              {   //成功 从Lock状态进入到safe状态
                                  if(operation.get(z).equals(condition4))
                                  {
                                      System.out.println("Congratulation! you get the luxurious things!");
                                      break;
                                  }
                              }
                              break;
                          }
                          //蜡烛没有移动 直接开锁
                          else if(operation.get(k).equals(condition4))
                          {
                              System.out.println("you have been eaten by the rabbit!");
                              break;
                          }
                      }
                      break;
                  }

              }
break;
          }
          else if(operation.get(i).equals(condition2))//close先都可以
          {
              for(int j=i+1;j<operation.size();j++)
              {
                  if(operation.get(j).equals(condition1))
                  {
                      for(int k=j+1;k<operation.size();k++)
                      {  //从wait进入到Lock状态 开始判断蜡烛的对错
                          if(operation.get(k).equals(condition3))
                          {
                              for(int z=k+1;z<operation.size();z++)
                              {   //成功 从Lock状态进入到safe状态
                                  if(operation.get(z).equals(condition4))
                                  {
                                      System.out.println("Congratulation! you get the luxurious things!");
                                      break;
                                  }
                              }
                              break;
                          }
                          //蜡烛没有移动 直接开锁
                          else if(operation.get(k).equals(condition4))
                          {
                              System.out.println("you have been eaten by the rabbit!");
                              break;
                          }
                      }
                      break;
                  }
              }
          break;}//否则继续处于wait状态
          else
              continue;
          }

      }
    }

