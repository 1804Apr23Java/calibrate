import { Question } from './question';

export class Attempt {

    quizId: number;
    name: string;
    questions: Question[];
    createdDate: number;
    numberOfQuestions: number;
    numCorrect: number;

}