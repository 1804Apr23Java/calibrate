import { Quiz } from './classes/quiz';
import { Question, Answers } from './classes/question'



export const ATTEMPT: Quiz = {

quizId: 1, name: 'Test Quiz', questions: [] = [

        { questionId: 1, difficulty: 5, value: "What is OOP?", libraryId: 1, answers: [] = [

            { answerId: 1, isCorrect: false, value: "Ranch dressing", questionId: 1, isSelected: false },
            { answerId: 318, isCorrect: true, value: "Object Oriented Programming", questionId: 1, isSelected: true }]},
        
        { questionId: 2, difficulty: 2, value: "Is Java a OOP language?", libraryId: 1, answers: [] = [

            { answerId: 3, isCorrect: true, value: "Yes.", questionId: 2, isSelected: false },
            { answerId: 293, isCorrect: false, value: "No.", questionId: 2, isSelected: true }]}]};