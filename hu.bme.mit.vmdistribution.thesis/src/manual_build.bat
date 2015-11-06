pdflatex --quiet thesis
bibtex -quiet thesis
pdflatex --quiet thesis
pdflatex --quiet thesis

@REM move thesis.pdf ../pdf/thesis.pdf

@del  *.aux *.dvi *.thm *.lof *.log *.lot *.fls *.out *.toc *.bbl *.blg

