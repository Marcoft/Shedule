package project.enter.shedule.Shedule;

import java.util.ArrayList;

import project.enter.shedule.db.DBHelpers;
import project.enter.shedule.db.DateDbSchedule;

public class loadDateToSchedule {


    public static void loadDate(String faculty, String course, String group, String day, DBHelpers dbHelpersl, ArrayList<ExampleItemSchedule> mExampleList, ExampleAdapterSchedule mAdapter){
        // TODO FTIT 1
        String[] FTIT1 = new String[]{"МС-1-1", "МП-1-1", "ВП-1-1", "КН-1-1", "ІБК-1-1", "ДЗ-1-1", "ПР-1-1", "ПР-1-2"};

        if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("1 курс")
                && group.equalsIgnoreCase("МС-1-1")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(1);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(2);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(3);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(4);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(5);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(6);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(7);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(8);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(9);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(10);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(11);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(12);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("1 курс")
                && group.equalsIgnoreCase("МП-1-1")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(13);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(14);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(15);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(16);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(17);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(18);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(19);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(20);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(21);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(22);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(23);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(24);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(25);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(26);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("1 курс") && group.equalsIgnoreCase("ВП-1-1")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(27);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(28);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(29);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(30);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(31);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(32);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(33);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(34);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(35);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(36);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(37);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(38);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("1 курс") && group.equalsIgnoreCase("КН-1-1")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(39);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(40);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(41);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(42);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(43);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(44);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(45);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(46);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(47);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(48);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(49);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(50);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(51);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(52);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("1 курс") && group.equalsIgnoreCase("ІБК-1-1")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(53);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(54);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(55);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(56);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(57);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(58);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(59);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(60);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(61);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(62);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(63);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(64);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(65);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(66);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("1 курс") && group.equalsIgnoreCase("ДЗ-1-1")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(67);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(68);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(69);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(70);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(71);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(72);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(73);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(74);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(75);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(76);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(77);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(78);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("1 курс")
                && group.equalsIgnoreCase("ПР-1-1")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(79);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(80);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(81);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(82);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(83);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(84);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(85);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(86);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(87);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(88);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(89);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(90);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(91);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(92);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("1 курс") && group.equalsIgnoreCase("ПР-1-2")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(93);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(94);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(95);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(96);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(97);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(98);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(99);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(100);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(101);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(102);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(103);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(104);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(105);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(106);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        // TODO FTIT 2
         //String[] FTIT2 = new String[]{"ТТ-2-1", "ТТ-2-2", "ТТ-2-3", "ТТ-2-4", "ТТ-2-5", "КН-2-1", "Кн-2-2", "ДЗ-2-1", "ПР-2-1", "ПР-2-2"};
         else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("2 курс") && group.equalsIgnoreCase("ТТ-2-1")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(107);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(108);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(109);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(110);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(111);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(112);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(113);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(114);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(115);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(116);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(117);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(118);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(119);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("2 курс") && group.equalsIgnoreCase("ТТ-2-2")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(120);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(121);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(122);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(123);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(124);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(125);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(126);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(127);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(128);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(129);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(130);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(131);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(132);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("2 курс") && group.equalsIgnoreCase("ТТ-2-3")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(133);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(134);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(135);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(136);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(137);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(138);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(139);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(140);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(141);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(142);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(143);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(144);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(145);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("2 курс") && group.equalsIgnoreCase("ТТ-2-4")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(146);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(147);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(148);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(149);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(150);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(151);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(152);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(153);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(154);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(155);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(156);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(157);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(158);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("2 курс") && group.equalsIgnoreCase("ТТ-2-5")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(159);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(160);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(161);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(162);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(163);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(164);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(165);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(166);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(167);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(168);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(169);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(170);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(171);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("2 курс") && group.equalsIgnoreCase("КН-2-1")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(172);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(173);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(174);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(175);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(176);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(177);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(178);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(179);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(180);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(181);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(182);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(183);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(184);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(185);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("2 курс") && group.equalsIgnoreCase("КН-2-2")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(186);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(187);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(188);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(189);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(190);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(191);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(192);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(193);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(194);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(195);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(196);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(197);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(198);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(199);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("2 курс") && group.equalsIgnoreCase("ДЗ-2-1")){
            if(day.equalsIgnoreCase("monday")){

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(200);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(201);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(202);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(203);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(204);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(205);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(206);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(207);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(208);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(209);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(210);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("2 курс") && group.equalsIgnoreCase("ПР-2-1")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(211);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(212);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(213);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(214);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(215);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(216);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(217);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(218);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(219);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(220);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(221);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(222);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(223);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(224);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("2 курс") && group.equalsIgnoreCase("ПР-2-2")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(225);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(226);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(227);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(228);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(229);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(230);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(231);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(232);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(233);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(234);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(235);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(236);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(237);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(238);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        // TODO FTIT 3
        //String[] FTIT3 = new String[]{"УТ-3-1", "УТ-3-2", "МП-3-1", "МП-3-2", "МК-3-1", "ОР-3-1", "ТСМ-3-1", "ВП-3-1", "КН-3-1", "ДЗ-3-1"};
        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("3 курс") && group.equalsIgnoreCase("УТ-3-1")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(239);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(240);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(241);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(242);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(243);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(244);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(245);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(246);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(247);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(248);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(249);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(250);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("3 курс") && group.equalsIgnoreCase("УТ-3-2")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(251);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(252);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(253);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(254);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(255);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(256);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(257);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(258);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(259);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(260);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(261);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(262);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("3 курс")
                && group.equalsIgnoreCase("МП-3-1")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(263);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(264);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(265);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(266);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(266);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(268);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(269);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(270);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(271);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(272);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(273);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(274);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("3 курс")
                && group.equalsIgnoreCase("МП-3-2")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(275);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(276);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(277);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(278);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(279);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(280);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(281);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(282);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(283);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(284);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(285);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(286);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("3 курс")
                && group.equalsIgnoreCase("МК-3-1")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(287);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(288);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(289);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(290);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(291);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(292);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(293);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(294);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(295);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(296);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(297);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(298);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("3 курс")
                && group.equalsIgnoreCase("ОР-3-1")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(299);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(300);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(301);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(302);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(303);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(304);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(305);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(306);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(307);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(308);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(309);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(310);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(311);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(312);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("3 курс")
                && group.equalsIgnoreCase("ТСМ-3-1")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(313);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(314);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(315);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(316);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(317);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(318);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(319);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(320);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(321);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(322);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(323);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(324);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(325);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(326);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("3 курс")
                && group.equalsIgnoreCase("ВП-3-1")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(327);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(328);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(329);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(330);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(331);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(332);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(333);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(334);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(335);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(336);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(337);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("3 курс")
                && group.equalsIgnoreCase("КН-3-1")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(338);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(339);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(340);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(341);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(342);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(343);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(344);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(345);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(346);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(347);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(348);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("3 курс")
                && group.equalsIgnoreCase("ДЗ-3-1")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(349);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(350);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(351);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(352);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(353);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(354);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(355);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(356);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(357);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(358);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(359);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        // TODO FTIT 4
       //String[] FTIT4 = new String[]{"УТ-4-1", "УТ-4-2", "МП-4-1", "МК-4-1", "ОР-4-1", "ТСМ-4-1", "ВП-4-1", "Кн-4-1", "ДЗ-4-1"};

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("4 курс")
                && group.equalsIgnoreCase("УТ-4-1")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(360);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(361);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(362);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(363);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(364);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(365);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(366);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(367);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(368);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(369);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(370);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(371);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(372);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("4 курс")
                && group.equalsIgnoreCase("УТ-4-2")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(373);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(374);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(375);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(376);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(377);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(378);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(379);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(380);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(381);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(382);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(383);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(384);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(385);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("4 курс")
                && group.equalsIgnoreCase("МП-4-1")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(386);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(387);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(388);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(389);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(390);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(391);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(392);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(393);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(394);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(395);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(396);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(397);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(398);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("4 курс")
                && group.equalsIgnoreCase("МК-4-1")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(399);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(400);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(401);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(402);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(403);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(404);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(405);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(406);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(407);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(408);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(409);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("4 курс")
                && group.equalsIgnoreCase("ОР-4-1")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(410);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(411);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(412);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(413);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(414);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(415);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(416);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(417);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(418);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(419);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(420);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("4 курс")
                && group.equalsIgnoreCase("ТСМ-4-1")){
            if(day.equalsIgnoreCase("monday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(421);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(422);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(423);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(424);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(425);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(426);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(427);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(428);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(429);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(430);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(431);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("4 курс")
                && group.equalsIgnoreCase("ВП-4-1")){
            if(day.equalsIgnoreCase("monday")){

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(432);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(433);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(434);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(435);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(436);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(437);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(438);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(439);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(440);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(441);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(442);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("4 курс")
                && group.equalsIgnoreCase("КН-4-1")){
            if(day.equalsIgnoreCase("monday")){

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(443);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(444);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(445);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(446);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(447);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(448);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(449);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(450);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(451);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(452);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(453);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФТІТ") && course.equalsIgnoreCase("4 курс")
                && group.equalsIgnoreCase("ДЗ-4-1")){
            if(day.equalsIgnoreCase("monday")){

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(454);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(455);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(456);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(457);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(458);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(459);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(460);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(461);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(462);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(463);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(464);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        // TODO FMLT 1
        //String[] FMLT1 = new String[]{"МН-1-1", "МН-1-2", "МН-1-3", "МН-1-4", "ФТ-1-1", "ОА-1-1", "ТР-1-1", "ТР-1-2"};
        else if(faculty.equalsIgnoreCase("ФМЛТ") && course.equalsIgnoreCase("1 курс")
                && group.equalsIgnoreCase("МН-1-1")){
            if(day.equalsIgnoreCase("monday")){

            }else if(day.equalsIgnoreCase("tuesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(443);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(444);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(445);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("wednesday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(443);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(444);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(445);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("thursday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(443);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(444);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(445);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }else if(day.equalsIgnoreCase("friday")){
                DateDbSchedule dateDbSchedule =  dbHelpersl.getDateSchedule(443);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(444);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));
                dateDbSchedule =  dbHelpersl.getDateSchedule(445);
                mExampleList.add(new ExampleItemSchedule(dateDbSchedule.getStartTime(),dateDbSchedule.getEndTime(),dateDbSchedule.getNameSubject(),dateDbSchedule.getNameRoom(),dateDbSchedule.getNameTeacher(),dateDbSchedule.getTypeLesson()));

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФМЛТ") && course.equalsIgnoreCase("1 курс")
                && group.equalsIgnoreCase("МН-1-2")){
            if(day.equalsIgnoreCase("monday")){

            }else if(day.equalsIgnoreCase("tuesday")){

            }else if(day.equalsIgnoreCase("wednesday")){

            }else if(day.equalsIgnoreCase("thursday")){

            }else if(day.equalsIgnoreCase("friday")){

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФМЛТ") && course.equalsIgnoreCase("1 курс")
                && group.equalsIgnoreCase("МН-1-3")){
            if(day.equalsIgnoreCase("monday")){

            }else if(day.equalsIgnoreCase("tuesday")){

            }else if(day.equalsIgnoreCase("wednesday")){

            }else if(day.equalsIgnoreCase("thursday")){

            }else if(day.equalsIgnoreCase("friday")){

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФМЛТ") && course.equalsIgnoreCase("1 курс")
                && group.equalsIgnoreCase("МН-1-4")){
            if(day.equalsIgnoreCase("monday")){

            }else if(day.equalsIgnoreCase("tuesday")){

            }else if(day.equalsIgnoreCase("wednesday")){

            }else if(day.equalsIgnoreCase("thursday")){

            }else if(day.equalsIgnoreCase("friday")){

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФМЛТ") && course.equalsIgnoreCase("1 курс")
                && group.equalsIgnoreCase("ФТ-1-1")){
            if(day.equalsIgnoreCase("monday")){

            }else if(day.equalsIgnoreCase("tuesday")){

            }else if(day.equalsIgnoreCase("wednesday")){

            }else if(day.equalsIgnoreCase("thursday")){

            }else if(day.equalsIgnoreCase("friday")){

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФМЛТ") && course.equalsIgnoreCase("1 курс")
                && group.equalsIgnoreCase("ОА-1-1")){
            if(day.equalsIgnoreCase("monday")){

            }else if(day.equalsIgnoreCase("tuesday")){

            }else if(day.equalsIgnoreCase("wednesday")){

            }else if(day.equalsIgnoreCase("thursday")){

            }else if(day.equalsIgnoreCase("friday")){

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФМЛТ") && course.equalsIgnoreCase("1 курс")
                && group.equalsIgnoreCase("ТР-1-1")){
            if(day.equalsIgnoreCase("monday")){

            }else if(day.equalsIgnoreCase("tuesday")){

            }else if(day.equalsIgnoreCase("wednesday")){

            }else if(day.equalsIgnoreCase("thursday")){

            }else if(day.equalsIgnoreCase("friday")){

            }
            mAdapter.notifyDataSetChanged();
        }

        else if(faculty.equalsIgnoreCase("ФМЛТ") && course.equalsIgnoreCase("1 курс")
                && group.equalsIgnoreCase("ТР-1-2")){
            if(day.equalsIgnoreCase("monday")){

            }else if(day.equalsIgnoreCase("tuesday")){

            }else if(day.equalsIgnoreCase("wednesday")){

            }else if(day.equalsIgnoreCase("thursday")){

            }else if(day.equalsIgnoreCase("friday")){

            }
            mAdapter.notifyDataSetChanged();
        }

        // TODO FMLT 2
        //String[] FMLT2 = new String[]{"МН-2-1", "МН-2-2", "МН-2-3", "МН-2-4", "МН-2-5", "ФТ-2-1", "ОА-2-1", "ТР-2-1", "ТР-2-2", "ТР-2-3", "ТР-2-4", "ТР-2-5"};


        // TODO FMLT 3
        //String[] FMLT3 = new String[]{"ТМ-3-1", "ТМ-3-2", "ТМ-3-3", "МА-3-1", "ЛГ-3-1", "ЛГ-3-2", "ФТ-3-1", "ФТ-3-2", "ОА-3-1", "ТР-3-1", "ТР-3-2"};


        // TODO FMLT 4
        //String[] FMLT4 = new String[]{"ТМ-4-1", "ТМ-4-2", "ТМ-4-3", "ЛГ-4-1", "ЛГ-4-2", "ФТ-4-1", "ОА-4-1", "ТР-4-1", "ТР-4-2"};


        // TODO FTB 1
        //String[] FTB1 = new String[]{"БІ-1-1", "ГЗ-1-1", "ГЗ-1-2", "ПТ-1-1", "ГБ-1-1", "СА-1-1", "ТЗ-1-1"};


        // TODO FTB 2
        //String[] FTB2 = new String[]{"БІ-2-1,3", "БІ-2-2,4", "ГЗ-2-1", "ОМ-2-1", "ПТ-2-1", "ГБ-2-1"};


        // TODO FTB 3
        //String[] FTB3 = new String[]{"БД-3-1", "БА-3-1", "МТ-3-1", "ТК-3-1", "ГД-3-1", "ОМ-3-1"};



        // TODO FTB 4
        //String[] FTB4 = new String[]{"БД-4-1", "БД-4-2", "БА-4-1", "МТ-4-1", "ТК-4-1", "ГД-4-1"};


        // TODO FEP 1
        //String[] FEP1 = new String[]{"ТП-1-1", "ТП-1-2", "ТП-1-3", "ЕП-1-1", "ІП-1-1", "ФП-1-1", "ФП-1-2"};


        // TODO FEP 2
        //String[] FEP2 = new String[]{"ТП-2-1", "ТП-2-2", "ТП-2-3", "ЕП-2-1", "Еп-2-2", "ЕП-2-3", "ІП-2-1", "ФП-2-1", "ФП-2-2"};


        // TODO FEP 3
        //String[] FEP3 = new String[]{"ТП-3-1", "ТП-3-2", "Еп-3-1", "УПП-3-1", "МЕ-3-1", "ІП-3-1", "ФП-3-1", "ФП-3-2"};


        // TODO FEP 4
        //String[] FEP4 = new String[]{"ТП-4-1", "ТП-4-2", "ТП-4-3", "ТП-4-4", "ЕП-4-1", "МЕ-4-1", "ІП-4-1", "ФП-4-1", "ФП-4-2"};


    }

}
