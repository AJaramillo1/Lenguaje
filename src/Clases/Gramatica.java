/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author DELL LATITUDE E7440
 */
public class Gramatica
{

    String tokens[];
    int i;
    boolean correcto;

    public Gramatica(String[] cadena)
    {
        tokens = cadena;
        i = 0;
        correcto = true;
        Inicio();
    }

    public void Inicio()
    {
        if (tokens[i].equals("1"))
        {
            System.out.println(tokens[i]);
            i++;
            if (tokens[i].equals("14"))
            {
                System.out.println(tokens[i]);
                i++;
                if (tokens[i].equals("75"))
                {
                    System.out.println(tokens[i]);
                    i++;
                    if (tokens[i].equals("78"))
                    {
                        System.out.println(tokens[i]);
                        i++;
                        ClaseInicio();
                        if (tokens[i].equals("79"))
                        {
                            System.out.println(tokens[i]);
                            i++;
//                            Programa();
                            System.out.println("LA CADENA ES SINTACTICAMENTE CORRECTA");
                        }
                    } else
                    {
                        System.out.println("Se esperaba un Nombre de clase");
                        correcto = false;
                    }
                } else
                {
                    System.out.println("Se esperaba un class");
                    correcto = false;
                }
            } else
            {
                System.out.println("Se esperaba un Public");
                correcto = false;
            }

        } else
        {

        }
    }

    private void ClaseInicio()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("1"))
            {
                System.out.println(tokens[i]);
                i++;
                if (tokens[i].equals("2"))
                {
                    System.out.println(tokens[i]);
                    i++;
                    if (tokens[i].equals("3"))
                    {
                        System.out.println(tokens[i]);
                        i++;
                        if (tokens[i].equals("4"))
                        {
                            System.out.println(tokens[i]);
                            i++;
                            if (tokens[i].equals("84"))
                            {
                                System.out.println(tokens[i]);
                                i++;
                                if (tokens[i].equals("99"))
                                {
                                    System.out.println(tokens[i]);
                                    i++;
                                    if (tokens[i].equals("89"))
                                    {
                                        System.out.println(tokens[i]);
                                        i++;
                                        if (tokens[i].equals("90"))
                                        {
                                            System.out.println(tokens[i]);
                                            i++;
                                            if (tokens[i].equals("38"))
                                            {
                                                System.out.println(tokens[i]);
                                                i++;
                                                if (tokens[i].equals("85"))
                                                {
                                                    System.out.println(tokens[i]);
                                                    i++;
                                                    if (tokens[i].equals("78"))
                                                    {
                                                        System.out.println(tokens[i]);
                                                        i++;
                                                        Sentencias();
                                                        Declaracion();
                                                        //                             Llamada();
                                                        if (tokens[i].equals("79"))
                                                        {
                                                            System.out.println(tokens[i]);
                                                            i++;

                                                        } else
                                                        {
                                                            System.out.println("Se esperaba una }");
                                                            correcto = false;
                                                        }
                                                    } else
                                                    {
                                                        System.out.println("Se esperaba {");
                                                        correcto = false;
                                                    }
                                                } else
                                                {
                                                    System.out.println("Se esperaba )");
                                                    correcto = false;
                                                }
                                            } else
                                            {
                                                System.out.println("Se esperaba args");
                                                correcto = false;
                                            }
                                        } else
                                        {
                                            System.out.println("Se esperaba ]");
                                            correcto = false;
                                        }
                                    } else
                                    {
                                        System.out.println("Se esperaba [");
                                        correcto = false;
                                    }
                                } else
                                {
                                    System.out.println("Se esperaba String");
                                    correcto = false;
                                }
                            } else
                            {
                                System.out.println("Se esperaba (");
                                correcto = false;
                            }
                        } else
                        {
                            System.out.println("Se esperaba un main");
                            correcto = false;
                        }
                    } else
                    {
                        System.out.println("Se esperaba un void");
                        correcto = false;
                    }
                } else
                {
                    System.out.println("Se esperaba un static");
                    correcto = false;
                }

            } else
            {
                System.out.println("Se esperaba un public");
                correcto = false;
            }
        } else
        {

        }
    }

    private void Llamada()
    {
        if (i < tokens.length)
        {
            Llam();
            Imple();
            Llamada();
        } else
        {

        }
    }

    private void Imple()
    {
        if (i < tokens.length)
        {
            Sett();
            Imprimir();
            MetodoLlamada();
            Imple();
        } else
        {

        }
    }

    private void MetodoLlamada()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("74"))
            {
                System.out.println(tokens[i]);
                i++;
                if (tokens[i].equals("80"))
                {
                    System.out.println(tokens[i]);
                    i++;
                    if (tokens[i].equals("75"))
                    {
                        System.out.println(tokens[i]);
                        i++;
                        if (tokens[i].equals("88"))
                        {
                            System.out.println(tokens[i]);
                            i++;
                            MetodoLlamada();
                        }
                    }
                }
            }
        } else
        {

        }
    }

    private void Imprimir()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("27"))
            {
                System.out.println(tokens[i]);
                i++;
                if (tokens[i].equals("80"))
                {
                    System.out.println(tokens[i]);
                    i++;
                    if (tokens[i].equals("28"))
                    {
                        System.out.println(tokens[i]);
                        i++;
                        if (tokens[i].equals("80"))
                        {
                            System.out.println(tokens[i]);
                            i++;
                            if (tokens[i].equals("29"))
                            {
                                System.out.println(tokens[i]);
                                i++;
                                if (tokens[i].equals("84"))
                                {
                                    System.out.println(tokens[i]);
                                    i++;
                                    if (tokens[i].equals("74"))
                                    {
                                        System.out.println(tokens[i]);
                                        i++;
                                        if (tokens[i].equals("80"))
                                        {
                                            System.out.println(tokens[i]);
                                            i++;
                                            if (tokens[i].equals("58"))
                                            {
                                                System.out.println(tokens[i]);
                                                i++;
                                                if (tokens[i].equals("74"))
                                                {
                                                    System.out.println(tokens[i]);
                                                    i++;
                                                    if (tokens[i].equals("85"))
                                                    {
                                                        System.out.println(tokens[i]);
                                                        i++;
                                                        if (tokens[i].equals("88"))
                                                        {
                                                            System.out.println(tokens[i]);
                                                            i++;
                                                            Imprimir();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else
        {

        }
    }

    private void Sett()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("74"))
            {
                System.out.println(tokens[i]);
                i++;
                if (tokens[i].equals("80"))
                {
                    System.out.println(tokens[i]);
                    i++;
                    if (tokens[i].equals("57"))
                    {
                        System.out.println(tokens[i]);
                        i++;
                        if (tokens[i].equals("74"))
                        {
                            System.out.println(tokens[i]);
                            i++;
                            if (tokens[i].equals("84"))
                            {
                                System.out.println(tokens[i]);
                                i++;
                                if (tokens[i].equals("74"))
                                {
                                    System.out.println(tokens[i]);
                                    i++;
                                    if (tokens[i].equals("85"))
                                    {
                                        System.out.println(tokens[i]);
                                        i++;
                                        if (tokens[i].equals("88"))
                                        {
                                            System.out.println(tokens[i]);
                                            i++;
                                            Sett();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else
        {

        }
    }

    private void Llam()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("75"))
            {
                System.out.println(tokens[i]);
                i++;
                if (tokens[i].equals("74"))
                {
                    System.out.println(tokens[i]);
                    i++;
                    if (tokens[i].equals("68"))
                    {
                        System.out.println(tokens[i]);
                        i++;
                        if (tokens[i].equals("23"))
                        {
                            System.out.println(tokens[i]);
                            i++;
                            if (tokens[i].equals("75"))
                            {
                                System.out.println(tokens[i]);
                                i++;
                                if (tokens[i].equals("84"))
                                {
                                    System.out.println(tokens[i]);
                                    i++;
                                    if (tokens[i].equals("85"))
                                    {
                                        System.out.println(tokens[i]);
                                        i++;
                                        if (tokens[i].equals("88"))
                                        {
                                            System.out.println(tokens[i]);
                                            i++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else
        {

        }
    }

    private void Sentencias()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("8"))
            {
                System.out.println(tokens[i]);
                i++;
                Si();
                Sentencias();
            } else
            {
                if (tokens[i].equals("5"))
                {
                    System.out.println(tokens[i]);
                    For();
                    i++;
                    Sentencias();
                } else
                {
                    if (tokens[i].equals("7"))
                    {
                        While();
                        i++;
                        Sentencias();
                    } else
                    {
                        if (tokens[i].equals("6"))
                        {
                            DoWhile();
                            i++;
                            Sentencias();
                        } else
                        {
                            if (tokens[i].equals("27"))
                            {
                                Print();
                                i++;
                                Sentencias();
                            } else
                            {
                                if (tokens[i].equals("75"))
                                {
                                    Operacion();
                                    i++;
                                    Sentencias();
                                }
                            }
                        }
                    }
                }
            }
        } else
        {

        }
    }

    private void Operacion()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("83"))
            {
                System.out.println(tokens[i]);
                i++;
                if (tokens[i].equals("73"))
                {
                    System.out.println(tokens[i]);
                    i++;
                    OpeArit();
                }
            } else
            {
                if (tokens[i].equals("73"))
                {
                    System.out.println(tokens[i]);
                    i++;
                    OpeArit();
                }
            }
        } else
        {

        }
    }

    private void OpeArit()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("67"))
            {
                System.out.println(tokens[i]);
                i++;
                Operacion();
            }
        }
    }

    private void For()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("5"))
            {
                System.out.println(tokens[i]);
                i++;
                if (tokens[i].equals("84"))
                {
                    System.out.println(tokens[i]);
                    i++;
                    Inicializacion();
                    if (tokens[i].equals("88"))
                    {
                        System.out.println(tokens[i]);
                        i++;
                        Exp1();
                        if (tokens[i].equals("88"))
                        {
                            System.out.println(tokens[i]);
                            i++;
                            Dec();
                            if (tokens[i].equals("855"))
                            {
                                System.out.println(tokens[i]);
                                i++;
                                if (tokens[i].equals("78"))
                                {
                                    System.out.println(tokens[i]);
                                    i++;
                                    Sentencias();
                                    if (tokens[i].equals("79"))
                                    {
                                        System.out.println(tokens[i]);
                                        i++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else
        {

        }
    }

    private void Exp1()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("73") || tokens[i].equals("50") || tokens[i].equals("51"))
            {
                System.out.println(tokens[i]);
                i++;
                Con1();
            }
        } else
        {

        }
    }

    private void Exp()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("73"))
            {
                System.out.println(tokens[i]);
                i++;
                Con();
            }
        } else
        {

        }
    }

     private void Con()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("64"))
            {
                System.out.println(tokens[i]);
                i++;
                Exp();
            }
        } else
        {

        }
    }

    private void Con1()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("64"))
            {
                System.out.println(tokens[i]);
                i++;
                Exp1();
            }
        } else
        {

        }
    }

    private void Inicializacion()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("99"))
            {
                System.out.println(tokens[i]);
                i++;
                if (tokens[i].equals("74"))
                {
                    System.out.println(tokens[i]);
                    i++;
                    if (tokens[i].equals("68"))
                    {
                        System.out.println(tokens[i]);
                        i++;
                        if (tokens[i].equals("73"))
                        {
                            System.out.println(tokens[i]);
                            i++;

                        }
                    }
                }
            }
        } else
        {

        }
    }

    private void Declaracion()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("99"))
            {
                i++;
                Variable();
                Get();
                Set();
                Declaracion();
            }
        }
    }

    private void Variable()
    {
        if (i < tokens.length)
        {
            System.out.println(tokens[i]);
            i++;
            if (tokens[i].equals("74"))
            {
                System.out.println(tokens[i]);
                i++;
                if (tokens[i].equals("68"))
                {
                    System.out.println(tokens[i]);
                    i++;
                    if (tokens[i].equals("73"))
                    {
                        System.out.println(tokens[i]);
                        i++;
                        if (tokens[i].equals("88"))
                        {
                            System.out.println(tokens[i]);
                            i++;
                        }
                    }
                }
            }
        } else
        {

        }
    }

    private void Si()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("84"))
            {
                System.out.println(tokens[i]);
                i++;
                Exp();
                if (tokens[i].equals("85"))
                {
                    System.out.println(tokens[i]);
                    i++;
                    if (tokens[i].equals("78"))
                    {
                        System.out.println(tokens[i]);
                        i++;
                        Sentencias();
                        if (tokens[i].equals("79"))
                        {
                            System.out.println(tokens[i]);
                            i++;
                            Sino();
                        }
                    }
                }
            }
        }
    }

    private void Sino()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("9"))
            {
                System.out.println(tokens[i]);
                i++;
                if (tokens[i].equals("78"))
                {
                    System.out.println(tokens[i]);
                    i++;
                    Sentencias();
                    if (tokens[i].equals("79"))
                    {
                        System.out.println(tokens[i]);
                        i++;
                        Sentencias();
                    }
                }
            }
        } else
        {

        }
    }

    private void Get()
    {
        if (i < tokens.length)
        {

            if (tokens[i].equals("1"))
            {
                System.out.println(tokens[i]);
                i++;
                if (tokens[i].equals("74"))
                {
                    System.out.println(tokens[i]);
                    i++;
                    if (tokens[i].equals("58"))
                    {
                        System.out.println(tokens[i]);
                        i++;
                        if (tokens[i].equals("80"))
                        {
                            System.out.println(tokens[i]);
                            i++;
                            if (tokens[i].equals("75"))
                            {
                                System.out.println(tokens[i]);
                                i++;
                                if (tokens[i].equals("84"))
                                {
                                    System.out.println(tokens[i]);
                                    i++;
                                    if (tokens[i].equals("85"))
                                    {
                                        System.out.println(tokens[i]);
                                        i++;
                                        if (tokens[i].equals("78"))
                                        {
                                            System.out.println(tokens[i]);
                                            i++;
                                            if (tokens[i].equals("19"))
                                            {
                                                System.out.println(tokens[i]);
                                                i++;
                                                if (tokens[i].equals("75"))
                                                {
                                                    System.out.println(tokens[i]);
                                                    i++;
                                                    if (tokens[i].equals("79"))
                                                    {
                                                        System.out.println(tokens[i]);
                                                        i++;

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }
    }

    private void Set()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("1"))
            {
                System.out.println(tokens[i]);
                i++;
                if (tokens[i].equals("2"))
                {
                    System.out.println(tokens[i]);
                    i++;
                    if (tokens[i].equals("57"))
                    {
                        System.out.println(tokens[i]);
                        i++;
                        if (tokens[i].equals("80"))
                        {
                            System.out.println(tokens[i]);
                            i++;
                            if (tokens[i].equals("75"))
                            {
                                System.out.println(tokens[i]);
                                i++;
                                if (tokens[i].equals("84"))
                                {
                                    System.out.println(tokens[i]);
                                    i++;
                                    if (tokens[i].equals("74"))
                                    {
                                        System.out.println(tokens[i]);
                                        i++;
                                        if (tokens[i].equals("75"))
                                        {
                                            System.out.println(tokens[i]);
                                            i++;
                                            if (tokens[i].equals("85"))
                                            {
                                                System.out.println(tokens[i]);
                                                i++;
                                                if (tokens[i].equals("78"))
                                                {
                                                    System.out.println(tokens[i]);
                                                    i++;
                                                    if (tokens[i].equals("31"))
                                                    {
                                                        System.out.println(tokens[i]);
                                                        i++;
                                                        if (tokens[i].equals("80"))
                                                        {
                                                            System.out.println(tokens[i]);
                                                            i++;
                                                            if (tokens[i].equals("75"))
                                                            {
                                                                System.out.println(tokens[i]);
                                                                i++;
                                                                if (tokens[i].equals("68"))
                                                                {
                                                                    System.out.println(tokens[i]);
                                                                    i++;
                                                                    if (tokens[i].equals("75"))
                                                                    {
                                                                        System.out.println(tokens[i]);
                                                                        i++;
                                                                        if (tokens[i].equals("88"))
                                                                        {
                                                                            System.out.println(tokens[i]);
                                                                            i++;
                                                                            if (tokens[i].equals("79"))
                                                                            {
                                                                                System.out.println(tokens[i]);
                                                                                i++;

                                                                            }

                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }
            }
        }
    }

    private void While()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("84"))
            {
                System.out.println(tokens[i]);
                i++;
                Exp1();
                if (tokens[i].equals("85"))
                {
                    System.out.println(tokens[i]);
                    i++;
                    if (tokens[i].equals("78"))
                    {
                        System.out.println(tokens[i]);
                        i++;
                        Sentencias();
                        Dec();
                        if (tokens[i].equals("79"))
                        {
                            System.out.println(tokens[i]);
                            i++;

                        }

                    }

                }

            }

        }
    }

    private void Dec()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("74"))
            {
                System.out.println(tokens[i]);
                i++;
                if (tokens[i].equals("60"))
                {
                    System.out.println(tokens[i]);
                    i++;

                }
            }
        } else
        {

        }
    }

    private void DoWhile()
    {
        if (i < tokens.length)
        {

            if (tokens[i].equals("78"))
            {
                System.out.println(tokens[i]);
                i++;
                Sentencias();
                Dec();
                if (tokens[i].equals("79"))
                {
                    System.out.println(tokens[i]);
                    i++;
                    if (tokens[i].equals("78"))
                    {
                        System.out.println(tokens[i]);
                        i++;
                        if (tokens[i].equals("4"))
                        {
                            System.out.println(tokens[i]);
                            i++;
                            Exp1();
                            if (tokens[i].equals("85"))
                            {
                                System.out.println(tokens[i]);
                                i++;
                                if (tokens[i].equals("88"))
                                {
                                    System.out.println(tokens[i]);
                                    i++;

                                }

                            }

                        }

                    }

                }

            }

        }
    }

    private void Print()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("80"))
            {
                System.out.println(tokens[i]);
                i++;
                if (tokens[i].equals("28"))
                {
                    System.out.println(tokens[i]);
                    i++;
                    if (tokens[i].equals("80"))
                    {
                        System.out.println(tokens[i]);
                        i++;
                        if (tokens[i].equals("29"))
                        {
                            System.out.println(tokens[i]);
                            i++;
                            if (tokens[i].equals("84"))
                            {
                                System.out.println(tokens[i]);
                                i++;
                                Imp();
                                if (tokens[i].equals("85"))
                                {
                                    System.out.println(tokens[i]);
                                    i++;
                                    if (tokens[i].equals("88"))
                                    {
                                        System.out.println(tokens[i]);
                                        i++;

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }
    }

    private void Imp()
    {

        if (i < tokens.length)
        {
            if (tokens[i].equals("74") || tokens[i].equals("73") || tokens[i].equals("75") || tokens[i].equals("76"))
            {
                System.out.println(tokens[i]);
                i++;
                Imp1();
            }
        } else
        {

        }
    }

    private void Imp1()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("67"))
            {
                System.out.println(tokens[i]);
                i++;
                if (tokens[i].equals("74") || tokens[i].equals("73") || tokens[i].equals("75") || tokens[i].equals("76"))
                {
                    Imp();
                }
            }
        } else
        {

        }
    }

    private void Programa()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("78"))
            {
                i++;
                Declaracion();
                Clase();
                if (tokens[i].equals("78"))
                {
                    i++;
                }
            }else{
                
            }
        } else
        {

        }
    }

    private void Clase()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("99"))
            {
                System.out.println(tokens[i]);
                i++;
                if (tokens[i].equals("14"))
                {
                    System.out.println(tokens[i]);
                    i++;
                    if (tokens[i].equals("75"))
                    {
                        System.out.println(tokens[i]);
                        i++;
                        if (tokens[i].equals("78"))
                        {
                            System.out.println(tokens[i]);
                            i++;
                            Metodo();
                            if (tokens[i].equals("79"))
                            {
                                System.out.println(tokens[i]);
                                i++;
                            }
                        }
                    }
                }
            }
        }
    }

    private void Metodo()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("99"))
            {
                System.out.println(tokens[i]);
                i++;

                TipoMetodo();
                if (tokens[i].equals("75"))
                {
                    System.out.println(tokens[i]);
                    i++;
                    if (tokens[i].equals("84"))
                    {
                        System.out.println(tokens[i]);
                        i++;
                        if (tokens[i].equals("85"))
                        {
                            System.out.println(tokens[i]);
                            i++;
                            if (tokens[i].equals("88"))
                            {
                                System.out.println(tokens[i]);
                                i++;
                            }
                        }
                    }
                }
            } else
            {
                TipoMetodo();
                if (tokens[i].equals("75"))
                {
                    System.out.println(tokens[i]);
                    i++;
                    if (tokens[i].equals("84"))
                    {
                        System.out.println(tokens[i]);
                        i++;
                        if (tokens[i].equals("85"))
                        {
                            System.out.println(tokens[i]);
                            i++;
                            if (tokens[i].equals("88"))
                            {
                                System.out.println(tokens[i]);
                                i++;
                                if (tokens[i].equals("78"))
                                {
                                    System.out.println(tokens[i]);
                                    i++;
                                    Sentencias();
                                    if (tokens[i].equals("79"))
                                    {
                                        System.out.println(tokens[i]);
                                        i++;
                                        Metodo();
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }
    }

    private void TipoMetodo()
    {
        if (i < tokens.length)
        {
            if (tokens[i].equals("17") || tokens[i].equals("18") || tokens[i].equals("1"))
            {
                System.out.println(tokens[i]);
                i++;
            }
        } else
        {

        }
    }
}
