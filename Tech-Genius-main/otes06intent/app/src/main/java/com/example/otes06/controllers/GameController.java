package com.example.otes06.controllers;

import android.util.Log;

import com.example.otes06.models.Answer;
import com.example.otes06.models.Question;
import com.example.otes06.models.User;

import com.example.otes06.repository.AnswerRepository;
import com.example.otes06.repository.QuestionRepository;
import com.example.otes06.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;


public class GameController {

    private AnswerRepository ar;
    private QuestionRepository qr;
    public User user = new User();

    public GameController(){

    }


    public User createUser() {
        return new User();
    }

    public List<Question> getQuestions(){

        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Map<String, String>>> typeReference = new TypeReference<>() {};
        Utils utils = new Utils();
        String jsonString = utils.questions;
        List<Map<String, String>> listaMapQuestions = new ArrayList<>();
        try {
            listaMapQuestions = objectMapper.readValue(jsonString, typeReference);
            Log.i("RESPONSETest",listaMapQuestions.get(0).toString());

        } catch (Exception e){
            e.printStackTrace();
            Log.i("RESPONSETest",e.toString());

        }

        List<Question> questionList = new ArrayList<>();
        for(Map<String,String> json : listaMapQuestions){
            int id = Integer.parseInt(json.get("id"));
            List<Answer> answers = findAnswersById(id);
            Question question = new Question(id,json.get("question_text"),Integer.parseInt(json.get("difficult")),answers);
            questionList.add(question);
        }

        return shuffleList(questionList);
    }

    public List<Answer> getAnswers(){

        Utils utils = new Utils();
        String jsonString = utils.answers;

        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Map<String,String>>> typeReference = new TypeReference<>() {};
//        TypeReference<List<Answer>> typeReference = new TypeReference<List<Answer>>() {};




        List<Map<String, String>> answerList = new ArrayList<>();
        try {
            answerList = objectMapper.readValue(jsonString, typeReference);
//            Log.i("RESPONSETest2",answerList.get(0).toString());


        } catch (Exception e){
            e.printStackTrace();
//            Log.i("RESPONSETest2",e.toString());

        }


        List<Answer> answersList = new ArrayList<>();
        for( Map<String, String> json : answerList){

            Log.i("Teste2",json.toString());
            try {

                Answer answer =
                        new Answer(Integer.parseInt(json.get("id")),Integer.parseInt(json.get("question_id")),Boolean.valueOf(json.get("correct_answer")),json.get("answer_text"));

                answersList.add(answer);
            }catch (Exception e){
                Log.i("RESPONSETest",e.toString());
            }

        }

        return answersList;
    }

    public List<Answer> findAnswersById(int id){
        var list = getAnswers();
        List<Answer> returnList = new ArrayList<>();
        for(Answer answer: list){
            if(answer.getQuestionID() == id){
                returnList.add(answer);
            }
        }
        return shuffleList(returnList);
    }

    public static <T> List<T> shuffleList(List<T> list) {
        Collections.shuffle(list);
        return list;
    }
}
