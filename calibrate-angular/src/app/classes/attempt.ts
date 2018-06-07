import { Question } from './question';

export class Quiz {

    quizId: number;
    name: string;
    questions: Question[];
    createdData: number;
    numberOfQuestions: number;
    numCorrect: number;

}