import { Library } from '../app/classes/library';
import { Question, Answers } from './classes/question';


export const LIBS: Library[] = [

    { accountId: 1, libraryId: 1, name: 'Core Java', status: 0, question: [] = [ //Core Java Library

        { questionId: 1, difficulty: 5, value: "What is OOP?", libraryId: 1, answers: [] = [

            { answerId: 1, isCorrect: false, value: "Ranch dressing", questionId: 1, isSelected: false },
            { answerId: 2, isCorrect: true, value: "Object Oriented Programming", questionId: 1, isSelected: false }]},
        
        { questionId: 2, difficulty: 2, value: "Is Java a OOP language?", libraryId: 1, answers: [] = [

            { answerId: 3, isCorrect: true, value: "Yes.", questionId: 2, isSelected: false },
            { answerId: 4, isCorrect: false, value: "No.", questionId: 2, isSelected: false }]}]},
    
    { accountId: 1, libraryId: 2, name: 'Angular', status: 1,  question: [] = [ //Angular Library
        
        { questionId: 5, difficulty: 5, value: "What is Angular?", libraryId: 2, answers: [] = [

            { answerId: 12, isCorrect: false, value: "Italian dressing", questionId: 5, isSelected: false },
            { answerId: 13, isCorrect: true, value: "A bunch of Javascript", questionId: 5, isSelected: false }]}]},
        
        
    { accountId: 1, libraryId: 3, name: 'Servlets', status: 2,  question: [] = [ //Servlets Library
        
        { questionId: 9, difficulty: 5, value: "What are Servlets?", libraryId: 2, answers: [] = [

            { answerId: 21, isCorrect: true, value: "Request Handlers", questionId: 9, isSelected: false },
            { answerId: 22, isCorrect: false, value: "Nobody knows.", questionId: 9, isSelected: false }]}]}
                
        ];


    /*
    ,
    { accountId: 1, libraryId: 3, name: 'Servlets', question: [], status: 2 },
    { accountId: 1, libraryId: 4, name: 'SQL', question: [], status: 0 },
    { accountId: 1, libraryId: 5, name: 'HTML', question: [], status: 0 },
    */
