{{- define "demo-chart.name" -}}
demo-chart
{{- end -}}

{{- define "demo-chart.fullname" -}}
{{ .Release.Name }}-{{ include "demo-chart.name" . }}
{{- end -}}
